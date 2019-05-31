package com.sans.views;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;

/**
 * This view should have four buttons in a layout aligned horizontally in the
 * following way.
 *
 * +------------------------------------------------------------------------+
 * | [Btn1] [Btn2] [Btn3]                                            [Btn4] |
 * +------------------------------------------------------------------------+
 *
 */
public class Tab2 extends CustomComponent implements View {

	private static final long serialVersionUID = 1L;

	public Tab2() {
		setCompositionRoot(createNavigationLayout());
	}

	private Layout createNavigationLayout() {
		HorizontalLayout layout = new HorizontalLayout();
		layout.setWidth("100%");
		
		Label name = new Label("Wenduo's world!");
		layout.addComponent(name);
		
		layout.setSpacing(true);
		return layout;

	}

	@Override
	public void enter(ViewChangeEvent event) {
		//Navigator method, ignore for now
	}

}
