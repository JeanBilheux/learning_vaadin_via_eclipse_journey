package com.example.demo;

import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;


@SpringUI
public class LayoutBasicsUI extends UI {
	
	private Navigator navigator;
	private VerticalLayout layout;
	
	@Override
	protected void init(VaadinRequest request) {
		setupLayout();
	}

	private void setupLayout() {
		layout = new VerticalLayout();
		layout.setMargin(true);
		layout.setSizeFull();
		setContent(layout);

		
		navigator = new Navigator(this, layout);
		navigator.addView("", new MainView(navigator));
		
	}


	

}
