package decorator.demo;

public class DecoratorRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcreteComponent cc = new ConcreteComponent();
		ConcreteDecorator1 d1 = new ConcreteDecorator1();
		ConcreteDecorator2 d2 = new ConcreteDecorator2();
		d1.setComponent(cc);
		d1.doJob();
		d2.setComponent(d1);
		d2.doJob();

	}

}
