package bridge.demo;

public class Triangle extends Shape{

	protected Triangle(IColor color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	void drawnShape(int border) {
		// TODO Auto-generated method stub
		System.out.println("Triangle with color: ");
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
