package memento.demo;

public class Originator {
	
	private String state;
	Memento memento;
	
	public void setState(String state) {
		this.state = state;
		System.out.println("current state: " + this.state);
	}
	
	public Memento OriginatorMemento() {
		Memento m = new Memento(this.state);
		return m;
	}
	
	public void Revert(Memento m) {
		state = m.getState();
		System.out.println("state is reverted to: " + this.state);
	}

}
