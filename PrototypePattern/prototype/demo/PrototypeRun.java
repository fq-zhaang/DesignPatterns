package prototype.demo;

import prototype.demo.car.*;

public class PrototypeRun {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		BasicCar nano_base = new Nano("Green Nano");
		nano_base.price = 1000;
		
		BasicCar ford_base = new Ford("Ford Yellow");
		ford_base.price = 50000;
		
		BasicCar bc1;
		bc1 = nano_base.clone();
		bc1.price = nano_base.price + BasicCar.setPrice();
		System.out.println("Car is: " + bc1.modelname + ", price: " + bc1.price);
		System.out.println(bc1 == nano_base);
		
		bc1 = ford_base.clone();
		bc1.price = ford_base.price + BasicCar.setPrice();
		System.out.println("Car is: " + bc1.modelname + ", price: " + bc1.price);
		System.out.println(bc1 == ford_base);
	}

}
