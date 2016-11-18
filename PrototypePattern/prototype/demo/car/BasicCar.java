package prototype.demo.car;

import java.util.Random;

public abstract class BasicCar implements Cloneable {
	
	public String modelname;
	public int price;
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public int getPrice() {
		return price;
	}
	public static int setPrice() {
		Random r = new Random();
		int p = r.nextInt(100000);
		return p;
	}
	
	public BasicCar clone() throws CloneNotSupportedException {
		return (BasicCar)super.clone();
	}

}
