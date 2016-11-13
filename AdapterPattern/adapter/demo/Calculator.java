package adapter.demo;

public class Calculator {
	
	Rect rectangle;
	public double getArea(Rect r) {
		this.rectangle = r;
		return this.rectangle.length * this.rectangle.width;
	}

}
