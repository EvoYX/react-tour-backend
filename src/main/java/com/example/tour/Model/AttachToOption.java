package com.example.tour.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AttachToOption {

	@JsonProperty("element")
	private String element; // The CSS selector or HTMLElement

	@JsonProperty("on")
	private String on; // The Popper placement for the tooltip (e.g., "top", "left", etc.)

	/*
	 * export type PopperPlacement = "auto" | "auto-start" | "auto-end" | "top" |
	 * "top-start" | "top-end" | "bottom" | "bottom-start" | "bottom-end" | "right"
	 * | "right-start" | "right-end" | "left" | "left-start" | "left-end";
	 * 
	 * StepOptionsAttachTo { element?: HTMLElement | string | null | (() =>
	 * HTMLElement | string | null | undefined); on?: PopperPlacement; }
	 * 
	 * * The element the step should be attached to on the page. An object with
	 * properties `element` and `on`.
	 *
	 * ```js const step = new Step(tour, { attachTo: { element: '.some
	 * .selector-path', on: 'left' }, ...moreOptions }); ```
	 *
	 * If you don’t specify an attachTo the element will appear in the middle of the
	 * screen. If you omit the `on` portion of `attachTo`, the element will still be
	 * highlighted, but the tooltip will appear in the middle of the screen, without
	 * an arrow pointing to the target.
	 */

}
