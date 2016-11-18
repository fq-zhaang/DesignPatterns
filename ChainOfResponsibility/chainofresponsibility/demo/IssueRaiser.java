package chainofresponsibility.demo;

public class IssueRaiser {
	
	public IReceiver setFirstReceiver;
	public IssueRaiser(IReceiver f) {
		this.setFirstReceiver = f;
	}
	
	public void RaiseMessage(Message msg) {
		if(this.setFirstReceiver != null) {
			this.setFirstReceiver.ProcessMessage(msg);
		}
	}

}
