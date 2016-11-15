package state.demo;

public class TV {
	
	private RemoteContol state;
	
	public RemoteContol getState() {
		return this.state;
	}
	
	public void setState(RemoteContol state) {
		this.state = state;
	}
	
	public TV(RemoteContol state) {
		this.state = state;
	}
	
	public void pressButton() {
		this.state.pressSwitch(this);
	}

}
