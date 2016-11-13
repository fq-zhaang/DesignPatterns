package decorator.demo;

public class AbstractDecorator extends AbstractComponent {
	
	protected AbstractComponent com;
	
	public void setComponent(AbstractComponent c) {
		this.com = c;
	}
	
	@Override
	public void doJob() {
		if (this.com != null) {
			com.doJob();
		}
	}
}
