package facade.demo;

import facade.demo.robotfacade.RobotFacade;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RobotFacade rf1 = new RobotFacade();
		rf1.ConstructRobot("blue", "Iron");
		RobotFacade rf2 = new RobotFacade();
		rf2.ConstructRobot("Green", "Steel");

	}

}
