package chainofresponsibility.demo;

public interface IReceiver {
	
	public Boolean ProcessMessage(Message msg);

}
