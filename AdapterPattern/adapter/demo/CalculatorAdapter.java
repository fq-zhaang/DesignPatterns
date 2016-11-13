package adapter.demo;

public class CalculatorAdapter {
	
	Calculator calculator;
	Triangle triangle;
	public double getArea(Triangle t) {
		calculator = new Calculator();
		triangle = t;
		Rect r = new Rect();
		r.length = triangle.base;
		r.width = 0.5 * triangle.height;
		return calculator.getArea(r);
	}

}
