package adapter.classandobjectadapter;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassAdapter c = new ClassAdapter();
		System.out.println("class adapter returns: " + c.getInteger());
		ClassAdapter c2 = new ClassAdapter();
		ObjectAdapter o = new ObjectAdapter(c2);
		System.out.println("object adapter returns: " + o.getInteger());

	}

}
