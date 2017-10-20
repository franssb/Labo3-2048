package be.steformations.fs.client.ui.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

import gwt.material.design.client.ui.MaterialButton;

public class DownButton extends MaterialButton implements ClickHandler{

	
	//TODO evenement descendre onclik
	@Override
	public void onClick(ClickEvent event) {
		GWT.log("DownButton.onClick()");
		
		
	}

}
