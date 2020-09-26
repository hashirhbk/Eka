package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class MyRESTController {

	@Autowired
	ContactRepository repository;

	@Autowired
	PlaceRepository pRepository;

	@GetMapping("/contacts")
	public Iterable<Contact> getContacts() {
		return repository.findAll();
	}

	@PostMapping("/add")
	public void addContact(@RequestBody Contact contact){
		repository.save(contact);
	}

	@DeleteMapping("/delete/{email}")
	public void deleteContact(@PathVariable("email") String email){
		repository.deleteByEmail(email);
	}

	@GetMapping("/getallcontacts/{placename}")
	public List<Contact> getAllContacts(@PathVariable("placename") String placename){
		Optional<Place> place = pRepository.findAllByNameIs(placename);
		if(place.isPresent()){
			int id = place.get().getId();
			return repository.findAllByPlaces(place.get());
		}
		return null;

	}

}
