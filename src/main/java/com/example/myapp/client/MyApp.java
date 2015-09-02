package com.example.myapp.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

public class MyApp implements EntryPoint {

	public void onModuleLoad() {
		final TextBox input = new TextBox();
		input.getElement().setAttribute("placeholder", "Your name");

		Button button = new Button("Say Hello");
		button.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				Window.alert("Hello, " + input.getValue() + "!");
			}
		});

		RootPanel.get().add(input);
		RootPanel.get().add(button);
	}
}
