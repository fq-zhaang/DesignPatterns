package decorator.demo;

public class ConcreteDecorator2 extends AbstractDecorator{
	
	public void doJob() {
		super.doJob();
		System.out.println("I am from extension 2");
	}
	
}
