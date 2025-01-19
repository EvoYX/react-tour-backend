package com.example.tour.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tour.Entities.TourStep;
import com.example.tour.Entities.Tour;
import com.example.tour.Repository.TourStepRepo;
import com.example.tour.Repository.TourRepo;

@Service
public class TourService {

	@Autowired
	private TourRepo tourRepository;

	@Autowired
	private TourStepRepo tourStepRepository;

	// Method to get all tours
	public List<Tour> getAllTours() {
		return tourRepository.findAll();
	}

	// Method to get a specific tour by its ID
	public Tour getTourById(String id) {
		return tourRepository.findById(id).orElse(null);
	}

	// Method to create or update a tour
	public Tour saveTour(Tour tour) {
		return tourRepository.save(tour);
	}

	// Method to create or update a tour step
	public TourStep saveTourStep(TourStep tourStep) {
		return tourStepRepository.save(tourStep);
	}
}
