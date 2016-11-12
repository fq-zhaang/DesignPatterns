package singletion.internalclass;

// thread safe
// with private internal class
// standard method to implement singleton in Java

public class MakeACaptain {
	
	private MakeACaptain() {}
	
	private static class SingletonHelper {
		private static final MakeACaptain _captain = new MakeACaptain();
	}
	
	public static MakeACaptain getCaptain() {
		return SingletonHelper._captain;
	}

}
