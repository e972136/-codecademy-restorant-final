package com.codecademy.restorant.repositories;

import com.codecademy.restorant.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {

    User findByName(String name);

}
