package com.example.tour.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdvanceStepOption {

	private String event; // Event type like "click", "hover", etc.
	private String selector; // CSS selector for the element that triggers the event

}
