package be.steformations.fs.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class Movement extends GwtEvent<MovementManager>{

	
	public final static GwtEvent.Type<MovementManager> type = new GwtEvent.Type<MovementManager>();
	
	@Override
	public GwtEvent.Type<MovementManager> getAssociatedType() {
		return type;
	}

	@Override
	protected void dispatch(MovementManager handler) {
		// TODO Auto-generated method stub
		
	}

}
