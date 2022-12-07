package com.codecademy.restorant.repositories;

import com.codecademy.restorant.entities.Review;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReviewRepository extends CrudRepository<Review,Integer> {
    List<Review> findByApproved(Boolean approved);

}
