package mediator.demo;

public class MediatorRrun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteMediator m = new ConcreteMediator();
		Friend1 amit = new Friend1(m, "Amit");
		Friend2 sohel = new Friend2(m, "Sohel");
		Boss raghu = new Boss(m, "Raghu");
		
		m.setFriend1(amit);
		m.setFriend2(sohel);
		m.setBoss(raghu);
		
		amit.Send("Amit here.");
		sohel.Send("Sohel here.");
		raghu.Send("Boss here.");
	}

}
