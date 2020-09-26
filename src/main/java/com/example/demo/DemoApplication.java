package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		ContactRepository repository = context.getBean(ContactRepository.class);
		Contact person1 = new Contact();
		person1.setName("John");
		person1.setEmail("john@gmail.com");
		Contact person2 = new Contact();
		person2.setName("Rohn");
		person2.setEmail("rohn@gmail.com");
		Place place1 = new Place();
		Place place2 = new Place();
		place1.setName("Delhi");
		place2.setName("India");
		List<Place> list =new ArrayList<>();
		list.add(place1);list.add(place2);
		person1.setPlaceList(list);
		repository.save(person1);
		repository.save(person2);
	}

}
