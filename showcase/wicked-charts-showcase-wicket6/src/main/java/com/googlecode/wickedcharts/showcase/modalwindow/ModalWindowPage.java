package com.googlecode.wickedcharts.showcase.modalwindow;

import org.apache.wicket.ajax.AjaxEventBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.extensions.ajax.markup.html.modal.ModalWindow;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;

/**
 * Tests if charts work within {@link ModalWindow}s.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class ModalWindowPage extends WebPage {

	private static final long serialVersionUID = 1L;

	public ModalWindowPage() {

		final ModalWindow window = new ModalWindow("modalWindow");
		window.setContent(new ChartPanel("content"));
		this.add(window);

		Button button = new Button("button");
		button.add(new AjaxEventBehavior("onclick") {
			private static final long serialVersionUID = 1L;

			@Override
			protected void onEvent(AjaxRequestTarget target) {
				window.show(target);
			}
		});
		this.add(button);

	}

}
