package bridge.demo;

public abstract class Shape {
	
	protected IColor color;
	protected Shape(IColor color) {
		this.color = color;
	}
	
	abstract void  drawnShape(int border);
	abstract void modifyBorder(int border, int increment);

}
