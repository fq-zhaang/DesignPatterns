package observer.simple;

public interface ISubject {
	public void notifyObserver();
	public void register(Observer o);
	public void unregister(Observer o);
}
