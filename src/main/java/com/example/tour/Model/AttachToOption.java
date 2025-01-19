package com.example.tour.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AttachToOption {
	private String element; // The CSS selector or element ID
	private String on; // The placement position, e.g., "top", "bottom", etc.

	/*
	 * export type PopperPlacement = "auto" | "auto-start" | "auto-end" | "top" |
	 * "top-start" | "top-end" | "bottom" | "bottom-start" | "bottom-end" | "right"
	 * | "right-start" | "right-end" | "left" | "left-start" | "left-end";
	 * 
	 * StepOptionsAttachTo { element?: HTMLElement | string | null | (() =>
	 * HTMLElement | string | null | undefined); on?: PopperPlacement; }
	 */

}
