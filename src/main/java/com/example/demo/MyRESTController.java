package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyRESTController {

	@Autowired
	ContactRepository repository;

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

}
