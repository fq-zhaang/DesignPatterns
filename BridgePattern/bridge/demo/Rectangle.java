package bridge.demo;

public class Rectangle extends Shape{

	protected Rectangle(IColor color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	void drawnShape(int border) {
		// TODO Auto-generated method stub
		System.out.println("Rectangle with color: ");
		this.color.fillWithColor(border);
	}

	@Override
	void modifyBorder(int border, int increment) {
		// TODO Auto-generated method stub
		System.out.println("\n Now we are changing the border length " + increment + " times");
		border *= increment;
		drawnShape(border);
	}

}
