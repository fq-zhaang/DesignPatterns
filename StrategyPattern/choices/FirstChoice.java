package choices;

public class FirstChoice implements IChoice{

	@Override
	public void myChoice(String s1, String s2) {
		// TODO Auto-generated method stub
		System.out.println("You wanted to add the numbers.");
		int a, b, sum;
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		sum = a + b;
		System.out.printf("addition result: %d%n", sum);
	}

}
