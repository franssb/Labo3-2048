package be.steformations.fs.client;

import com.google.gwt.user.client.ui.RootLayoutPanel;

import be.steformations.fs.client.ui.widget.UiPanel;

public class EntryPoint implements com.google.gwt.core.client.EntryPoint {

	@Override
	public void onModuleLoad() {
		UiPanel panel = new UiPanel();
		RootLayoutPanel.get().add(panel);

	}

}
