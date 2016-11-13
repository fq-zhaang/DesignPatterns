package decorator.demo;

public class ConcreteComponent extends AbstractComponent {
		
	@Override
	public void doJob() {
		System.out.println("I am from concrete component.");
	}

}
