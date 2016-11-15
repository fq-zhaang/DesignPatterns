package memento.demo;

public class MementoRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator o = new Originator();
		o.setState("First state.");
		
		CareTaker c = new CareTaker();
		c.SaveMemento(o.OriginatorMemento());
		
		o.setState("Second state.");
		
		o.Revert(c.RetrieveMemento());
	}

}
