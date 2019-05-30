package com.example.demo;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
public class MyDemoUI extends UI{

	private VerticalLayout root;
	
	@Override
	protected void init(VaadinRequest request) {
		
		setupLayout();
		setupHorizontalLayout();
	}

	private void setupLayout() {
		root = new VerticalLayout();
		root.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
		setContent(root);
		
	}

	private void setupHorizontalLayout() {

		Label name = new Label("First Name");
		TextField field = new TextField("");
		field.setWidth("100%");
		field.addValueChangeListener(event->fieldValueChanged());
		
		VerticalLayout layout = new VerticalLayout();
		layout.addComponents(name);
		layout.addComponentsAndExpand(field);
		
		root.addComponent(layout);
		
	}

	private Object fieldValueChanged() {
		Notification.show("Value changed!");
		return null;
	}
	
}
