package adapter.demo;

public class AdapterRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorAdapter c = new CalculatorAdapter();
		Triangle t = new Triangle(20, 10);
		System.out.println(c.getArea(t));

	}

}
