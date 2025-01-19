package com.example.tour.Entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "tours")

public class Tour {

	@Id
	private String id; // Unique identifier for each tour
	
	@JsonProperty("tourId")
	private String tourId; // Identifier for the tour
	
	@JsonProperty("name")
	private String name; // Name of the tour (Optional)
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("stepId")
	private List<String> stepId; // List of steps id in this tour

	/*
	 * In the future (like organizing steps into larger tours for better user
	 * tracking or grouping), you could introduce the Tour entity later. For now,
	 * keeping things simpler with just TourStep will make things more maintainable
	 */
}
