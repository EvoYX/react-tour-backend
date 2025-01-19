package com.example.tour.Entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.tour.Model.AdvanceStepOption;
import com.example.tour.Model.AttachToOption;
import com.example.tour.Model.Button;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "tour_steps")
public class TourStep {
	@Id
	private String id; // Automatically handled by MongoDB

	@JsonProperty("stepId")
	private String stepId;

	@JsonProperty("title")
	private String title;

	@JsonProperty("attachTo")
	private AttachToOption attachTo;

	@JsonProperty("elementSelector")
	private AdvanceStepOption advanceOn;

	@JsonProperty("placement")
	private String placement;

	@JsonProperty("arrow")
	private boolean arrow;

	@JsonProperty("buttons")
	private List<Button> buttons;

	@JsonProperty("highlight")
	private boolean highlight;

	/*		*//**
				 * The element the step should be attached to on the page. An object with
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
	/*
	 * attachTo?: StepOptionsAttachTo;
	 *//**
		 * An action on the page which should advance shepherd to the next step. It
		 * should be an object with a string `selector` and an `event` name ```js const
		 * step = new Step(tour, { advanceOn: { selector: '.some .selector-path', event:
		 * 'click' }, ...moreOptions }); ``` `event` doesn’t have to be an event inside
		 * the tour, it can be any event fired on any element on the page. You can also
		 * always manually advance the Tour by calling `myTour.next()`.
		 */
	/*
	 * advanceOn?: StepOptionsAdvanceOn;
	 *//**
		 * Whether to display the arrow for the tooltip or not
		 */
	/*
	 * arrow?: boolean;
	 *//**
		 * A function that returns a promise. When the promise resolves, the rest of the
		 * `show` code for the step will execute.
		 */
	/*
	 * beforeShowPromise?: () => Promise<unknown>;
	 *//**
		 * An array of buttons to add to the step. These will be rendered in a footer
		 * below the main body text.
		 */
	/*
	 * buttons?: ReadonlyArray<StepOptionsButton>;
	 *//**
		 * Should a cancel “✕” be shown in the header of the step?
		 */
	/*
	 * cancelIcon?: StepOptionsCancelIcon;
	 *//**
		 * A boolean, that when set to false, will set `pointer-events: none` on the
		 * target.
		 */
	/*
	 * canClickTarget?: boolean;
	 *//**
		 * A string of extra classes to add to the step's content element.
		 */
	/*
	 * classes?: string;
	 *//**
		 * An array of extra element selectors to highlight when the overlay is shown
		 * The tooltip won't be fixed to these elements, but they will be highlighted
		 * just like the `attachTo` element. ```js const step = new Step(tour, {
		 * extraHighlights: [ '.pricing', '#docs' ], ...moreOptions }); ```
		 */
	/*
	 * extraHighlights?: ReadonlyArray<string>;
	 *//**
		 * An extra class to apply to the `attachTo` element when it is highlighted
		 * (that is, when its step is active). You can then target that selector in your
		 * CSS.
		 */
	/*
	 * highlightClass?: string;
	 *//**
		 * The string to use as the `id` for the step.
		 */
	/*
	 * id?: string;
	 *//**
		 * An amount of padding to add around the modal overlay opening
		 */
	/*
	 * modalOverlayOpeningPadding?: number;
	 *//**
		 * An amount of border radius to add around the modal overlay opening
		 */
	/*
	 * modalOverlayOpeningRadius?: number | { topLeft?: number; bottomLeft?: number;
	 * bottomRight?: number; topRight?: number; };
	 *//**
		 * An amount to offset the modal overlay opening in the x-direction
		 */
	/*
	 * modalOverlayOpeningXOffset?: number;
	 *//**
		 * An amount to offset the modal overlay opening in the y-direction
		 */
	/*
	 * modalOverlayOpeningYOffset?: number;
	 *//**
		 * Extra [options to pass to
		 * FloatingUI]{@link https://floating-ui.com/docs/tutorial/}
		 */
	/*
	 * floatingUIOptions?: ComputePositionConfig;
	 *//**
		 * Should the element be scrolled to when this step is shown?
		 */
	/*
	 * scrollTo?: boolean | ScrollIntoViewOptions;
	 *//**
		 * A function that lets you override the default scrollTo behavior and define a
		 * custom action to do the scrolling, and possibly other logic.
		 */
	/*
	 * scrollToHandler?: (element: HTMLElement) => void;
	 *//**
		 * A function that, when it returns `true`, will show the step. If it returns
		 * `false`, the step will be skipped.
		 */
	/*
	 * showOn?: () => boolean;
	 *//**
		 * The text in the body of the step. It can be one of four types: ``` - HTML
		 * string - Array of HTML strings - `HTMLElement` object - `Function` to be
		 * executed when the step is built. It must return one of the three options
		 * above. ```
		 */
	/*
	 * text?: StepText;
	 *//**
		 * The step's title. It becomes an `h3` at the top of the step. ``` - HTML
		 * string - `Function` to be executed when the step is built. It must return
		 * HTML string. ```
		 */
	/*
	 * title?: StringOrStringFunction;
	 *//**
		 * You can define `show`, `hide`, etc events inside `when`. For example: ```js
		 * when: { show: function() { window.scrollTo(0, 0); } } ```
		 *//*
			 * when?: StepOptionsWhen;
			 */

}
