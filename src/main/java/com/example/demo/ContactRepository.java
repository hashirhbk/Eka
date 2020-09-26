package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContactRepository extends CrudRepository<Contact, Integer> {
    Long deleteByEmail(String email);

    List<Contact> findAllByPlaces(Place place);




}
