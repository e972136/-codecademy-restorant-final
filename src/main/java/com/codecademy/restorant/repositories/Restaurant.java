package com.codecademy.restorant.repositories;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Restaurant extends CrudRepository<Restaurant,Integer> {
    List<Restaurant> findByZipcode(String zipcode);
}
