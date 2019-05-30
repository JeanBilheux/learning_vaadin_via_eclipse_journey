package com.example.demo;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;


@SpringUI
public class LayoutBasicsEx1UI extends UI {


	@Override
	protected void init(VaadinRequest request) {
		
		setupLayout();
	}

	
//	private void setupLayout() {
//
//		HorizontalLayout root = new HorizontalLayout();
//		
//		Button button1 = new Button("Button 1");
//		Button button2 = new Button("Button 2");
//		Button button3 = new Button("Button 3");
//
//		HorizontalLayout rightLayout = new HorizontalLayout();
//		Button button4 = new Button("Button 4");
//		rightLayout.addComponent(button4);
//		rightLayout.setComponentAlignment(button4, Alignment.MIDDLE_RIGHT);
//		
//		root.addComponents(button1, button2, button3);
//		root.addComponentsAndExpand(rightLayout);
//		
//		setContent(root);
//		
//	}
	
	private void setupLayout() {

		HorizontalLayout root = new HorizontalLayout();
		
		Button button1 = new Button("Button 1");
		Button button2 = new Button("Button 2");
		Button button3 = new Button("Button 3");
		Button button4 = new Button("Button 4");
		
		root.addComponents(button1, button2, button3, button4);
		root.setExpandRatio(button4,  1);
		root.setComponentAlignment(button4,  Alignment.TOP_RIGHT);
		root.setWidth("100%");
		root.setSpacing(true);
		
		setContent(root);
		
	}

}
