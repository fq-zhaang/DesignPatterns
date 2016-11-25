package bridge.demo;

public class BridgeRun {
	
	public static void main(String[] args) {
		IColor green = new Green();
		Shape tr = new Triangle(green);
		tr.drawnShape(20);
		tr.modifyBorder(20,  3);
		
		IColor red = new Red();
		Shape rect = new Rectangle(red);
		rect.drawnShape(50);
		rect.modifyBorder(50, 2);
	}

}
