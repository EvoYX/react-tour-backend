package com.example.tour;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tour.Entities.Tour;
import com.example.tour.Entities.TourStep;
import com.example.tour.Repository.TourRepo;
import com.example.tour.Services.TourService;

@RestController
@RequestMapping("/api/tours")
public class TourController {

	@Autowired
	private TourRepo tourRepository;

	@Autowired
	private TourService tourService;

	// Get all tours
	@GetMapping
	public List<Tour> getAllTours() {
		return tourService.getAllTours();
	}

	// Save a new or existing tour
	@PostMapping
	public ResponseEntity<Tour> saveTour(@RequestBody Tour tour) {
		System.out.println("Received tour" + tour);
		Tour savedTour = tourRepository.save(tour);
		return new ResponseEntity<>(savedTour, HttpStatus.CREATED);
	}

	// Save a new or existing tour step
	@PostMapping("/step")
	public TourStep saveTourStep(@RequestBody TourStep tourStep) {
		return tourService.saveTourStep(tourStep);
	}
}
