package com.example.tour.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.tour.Entities.Tour;

public interface TourRepo extends MongoRepository<Tour, String> {

}
