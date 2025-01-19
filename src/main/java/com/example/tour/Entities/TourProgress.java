package com.example.tour.Entities;

import java.sql.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "tour_progress")
public class TourProgress {
	
	@JsonProperty("userId")
    private String userId;  // Maps the JSON property "userId" to the Java field userId

    @JsonProperty("tourId")
    private String tourId;  // Maps the JSON property "tourId" to the Java field tourId

    @JsonProperty("completedSteps")
    private List<String> completedSteps;  // Maps the JSON property "completedSteps" to the Java field completedSteps

    @JsonProperty("currentStep")
    private String currentStep;  // Maps the JSON property "currentStep" to the Java field currentStep

    @JsonProperty("startedAt")
    private Date startedAt;  // Maps the JSON property "startedAt" to the Java field startedAt

    @JsonProperty("completedAt")
    private Date completedAt;  // Maps the JSON property "completedAt" to the Java field completedAt


}
