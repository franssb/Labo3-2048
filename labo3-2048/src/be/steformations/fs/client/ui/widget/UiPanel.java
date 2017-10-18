package be.steformations.fs.client.ui.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class UiPanel extends Composite {

	private static UiPanelUiBinder uiBinder = GWT.create(UiPanelUiBinder.class);

	interface UiPanelUiBinder extends UiBinder<Widget, UiPanel> {
	}
	
	@UiField UpButton upButton;
	@UiField DownButton	downButton;
	@UiField LeftButton leftButton;
	@UiField RightButton  rightButton;

	public UiPanel() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
