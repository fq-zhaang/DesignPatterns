package choices;

public class SecondChoice implements IChoice{

	@Override
	public void myChoice(String s1, String s2) {
		// TODO Auto-generated method stub
		System.out.println("You wanted to concatenate the numbers.");
		System.out.println("The result is: " + s1 + s2);
	}

}
