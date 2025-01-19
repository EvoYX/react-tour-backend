package com.example.tour.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Button {

	@JsonProperty("action")
	private String action; // Can store the action name as a string or method name

	@JsonProperty("classes")
	private String classes; // Extra classes for the button

	@JsonProperty("disabled")
	private Boolean disabled; // Whether the button is disabled

	@JsonProperty("label")
	private String label; // The aria-label text of the button

	@JsonProperty("secondary")
	private Boolean secondary; // Whether it's a secondary button

	@JsonProperty("text")
	private String text;

	/**
	 * A function executed when the button is clicked on It is automatically bound
	 * to the `tour` the step is associated with, so things like `this.next` will
	 * work inside the action. You can use action to skip steps or navigate to
	 * specific steps, with something like: ```js action() { return
	 * this.show('some_step_name'); } ```
	 */
	/*
	 * action?: (this: Tour) => void;
	 *//**
		 * Extra classes to apply to the `<a>`
		 */
	/*
	 * classes?: string;
	 *//**
		 * Whether the button should be disabled When the value is `true`, or the
		 * function returns `true` the button will be disabled
		 */
	/*
	 * disabled?: boolean | (() => boolean);
	 *//**
		 * The aria-label text of the button
		 */
	/*
	 * label?: StringOrStringFunction;
	 *//**
		 * A boolean, that when true, adds a `shepherd-button-secondary` class to the
		 * button.
		 */
	/*
	 * secondary?: boolean;
	 *//**
		 * The HTML text of the button
		 *//*
			 * text?: StringOrStringFunction;
			 */

}
