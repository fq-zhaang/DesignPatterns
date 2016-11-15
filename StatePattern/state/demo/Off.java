package state.demo;

public class Off extends RemoteContol {

	@Override
	public void pressSwitch(TV context) {
		// TODO Auto-generated method stub
		System.out.println("I am off. Going to be on.");
		context.setState(new On());
	}

}
