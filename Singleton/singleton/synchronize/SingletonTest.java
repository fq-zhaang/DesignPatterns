package singleton.synchronize;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakeACaptain c1 = MakeACaptain.getCaptain();
		MakeACaptain c2 = MakeACaptain.getCaptain();
		if (c1 == c2) {
			System.out.println("same captain");
		}

	}

}
