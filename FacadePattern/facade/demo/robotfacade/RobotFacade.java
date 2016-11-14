package facade.demo.robotfacade;

import facade.demo.robotparts.RobotBody;
import facade.demo.robotparts.RobotColor;
import facade.demo.robotparts.RobotMetal;

public class RobotFacade {
	
	private RobotBody b;
	private RobotMetal m;
	private RobotColor c;
	
	public RobotFacade() {
		this.b = new RobotBody();
		this.m = new RobotMetal();
		this.c = new RobotColor();
	}
	
	public void ConstructRobot(String color, String metal) {
		c.SetColor(color);
		m.SetMetal(metal);
		b.CreateBody();
	}

}
