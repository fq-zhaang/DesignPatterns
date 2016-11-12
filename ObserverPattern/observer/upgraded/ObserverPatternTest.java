package observer.upgraded;

public class ObserverPatternTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observer o = new Observer();
		Subject s = new Subject();
		s.register(o);
		s.set_flag(5);
		s.set_flag(25);
		s.unregister(o);
		s.set_flag(50);
	}

}
