package mediator.demo;

public class ConcreteMediator extends Mediator{
	
	private Friend1 f1;
	private Friend2 f2;
	private Boss boss;
	
	public void setFriend1(Friend1 friend1) {
		this.f1 = friend1;
	}
	
	public void setFriend2(Friend2 friend2) {
		this.f2 = friend2;
	}
	
	public void setBoss(Boss boss) {
		this.boss = boss;
	}
	

	@Override
	public void Send(Friend f, String msg) {
		// TODO Auto-generated method stub
		if(f == f1) {
			f2.Notify(msg);
			boss.Notify(f1.name + "sends message to " + f2.name);
		}
		if(f == f2) {
			f1.Notify(msg);
			boss.Notify(f2.name + "sends message to " + f1.name);
		}
		if(f == boss) {
			f1.Notify(msg);
			f2.Notify(msg);
		}
	}

}
