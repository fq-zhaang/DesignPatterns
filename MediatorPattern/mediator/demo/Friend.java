package mediator.demo;

public class Friend {
	
	protected Mediator mediator;
	public String name;
	
	public Friend(Mediator _mediator) {
		this.mediator = _mediator;
	}

}
