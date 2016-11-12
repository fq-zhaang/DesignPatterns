package singleton.eagerinitialization;

// thread safe
// with eager initialization

public class MakeACaptain {
	
	private static MakeACaptain _captain = new MakeACaptain();
	private MakeACaptain() {}
	
	// lazy initialization
	public static MakeACaptain getCaptain(){
		return _captain;
	}

}
