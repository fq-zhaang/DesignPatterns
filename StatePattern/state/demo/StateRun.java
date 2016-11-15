package state.demo;

public class StateRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Off initState = new Off();
		TV tv = new TV(initState);
		tv.pressButton();
		tv.pressButton();

	}

}
