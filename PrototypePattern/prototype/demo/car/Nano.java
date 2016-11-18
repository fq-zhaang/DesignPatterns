package prototype.demo.car;

public class Nano extends BasicCar {
	
	public Nano(String m) {
		this.modelname = m;
	}
	
	@Override
	public BasicCar clone() throws CloneNotSupportedException {
		return (Nano)super.clone();
	}
}
