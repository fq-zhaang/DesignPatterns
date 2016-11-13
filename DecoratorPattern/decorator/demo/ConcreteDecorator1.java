package decorator.demo;

public class ConcreteDecorator1 extends AbstractDecorator{
	
	public void doJob() {
		super.doJob();
		System.out.println("I am from extension 1");
	}
	
}
