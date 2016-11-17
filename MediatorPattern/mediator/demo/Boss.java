package mediator.demo;

public class Boss extends Friend{
	public Boss(Mediator mediator, String name) {
		super(mediator);
		this.name = name;
	}
	
	public void Send(String msg) {
		this.mediator.Send(this, msg);
	}
	
	public void Notify(String msg) {
		System.out.println("Boss sees message: " + msg);
	}
}
