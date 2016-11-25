package visitor.demo;

public class Visitor implements IVisitor {

	@Override
	public void visit(MyClass myClassElement) {
		// TODO Auto-generated method stub
		System.out.println("Visitor is trying to change the integer value.");
		myClassElement.setM(100);
		System.out.println("Exiting from Visitor- visit.");
	}

}
