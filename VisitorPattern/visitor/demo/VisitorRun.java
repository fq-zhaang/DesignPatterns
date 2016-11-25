package visitor.demo;

public class VisitorRun {
	
	public static void main(String[] args) {
		IVisitor visitor= new Visitor();
		MyClass m = new MyClass();
		m.accept(visitor);
	}

}
