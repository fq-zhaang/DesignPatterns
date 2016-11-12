package observer.upgraded;

public class ObserverPatternTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observer o1 = new Observer();
		Subject s1 = new Subject();
		Observer o2 = new Observer();
		Subject s2 = new Subject();
		Observer o3 = new Observer();
		s1.register(o1);
		s1.register(o2);
		s1.register(o3);
		s2.register(o2);
		s2.register(o3);
		s1.set_flag(5);
		s1.set_flag(25);
		s1.unregister(o1);
		s1.set_flag(50);
	}

}
