package flyweight.demo;

public class FlyweightRun {
	
	public static void main(String[] args) throws Exception{
		RobotFactory robotFactory = new RobotFactory();
		IRobot shape = robotFactory.GetRobotFromFactory("small");
		shape.Print();
		for(int i = 0; i < 2; i++){
			shape = robotFactory.GetRobotFromFactory("small");
			shape.Print();
		}
		
		int n_robots = robotFactory.TotalObjectsCreated();
		System.out.println("created :" + n_robots);
		
		for(int i = 0; i< 5; i++) {
			shape = robotFactory.GetRobotFromFactory("large");
			shape.Print();
		}
		
		n_robots = robotFactory.TotalObjectsCreated();
		System.out.println("Created: " + n_robots);
	}

}
