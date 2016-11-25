package visitor.demo;

public class MyClass implements IOriginalInterface {
	
	private int m = 5;
	public int getM() {
		return this.m;
	}
	public void setM(int m) {
		this.m = m;
	}

	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		System.out.println("Initial value of the integer: " + this.m);
		visitor.visit(this);
		System.out.println("value of the integer now: " + this.m);
	}

}
