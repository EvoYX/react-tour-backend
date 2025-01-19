package com.example.tour.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.tour.Entities.TourStep;

public interface TourStepRepo extends MongoRepository<TourStep, String> {

}
