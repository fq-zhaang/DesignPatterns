package observer.upgraded;

public class Observer implements IObserver {
	
	@Override
	public void update(int newValue) {
		System.out.printf("flag value changed in Subject: %d%n", newValue);
	}
}
