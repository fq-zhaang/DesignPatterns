package observer.upgraded;

import java.util.*;

public class Subject implements ISubject {
	
	int _flag;
	List<IObserver> observerList = new ArrayList<IObserver>();
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (int i = 0;i < observerList.size(); i++) {
			observerList.get(i).update(this.get_flag());
		}
	}

	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		observerList.add(o);
	}

	@Override
	public void unregister(Observer o) {
		// TODO Auto-generated method stub
		observerList.remove(o);
	}

	public int get_flag() {
		return _flag;
	}

	public void set_flag(int _flag) {
		this._flag = _flag;
		this.notifyObserver();
	}
}
