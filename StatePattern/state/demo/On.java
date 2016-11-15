package state.demo;

public class On extends RemoteContol {

	@Override
	public void pressSwitch(TV context) {
		// TODO Auto-generated method stub
		System.out.println("I am already on. Going to be off.");
		context.setState(new Off());
	}

}
