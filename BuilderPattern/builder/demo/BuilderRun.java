package builder.demo;

public class BuilderRun {
	
	public static void main(String[] args) {
		
		Director director = new Director();
		IBuilder car = new Car();
		IBuilder motor = new Motorcycle();
		
		director.Construct(car);
		director.Construct(motor);
		Product p1 = car.Getvehicle();
		Product p2 = motor.Getvehicle();
		p1.Show();
		p2.Show();
		
	}

}
