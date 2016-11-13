package adapter.classandobjectadapter;

public class ObjectAdapter {
	
	private IIntegerValue myInt;
	
	public ObjectAdapter(IIntegerValue i) {
		this.myInt = i;
	}
	
	public int getInteger() {
		return 2 + this.myInt.getInteger();
	}

}
