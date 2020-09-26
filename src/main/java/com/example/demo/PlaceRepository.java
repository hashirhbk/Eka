package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PlaceRepository extends CrudRepository<Place,Integer> {
    Optional<Place> findAllByNameIs(String name);
}
