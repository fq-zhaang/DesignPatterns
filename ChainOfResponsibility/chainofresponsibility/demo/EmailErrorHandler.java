package chainofresponsibility.demo;

public class EmailErrorHandler implements IReceiver {

	private IReceiver _nextReceiver;
	public EmailErrorHandler(IReceiver next) {
		// TODO Auto-generated constructor stub
		this._nextReceiver = next;
	}
	@Override
	public Boolean ProcessMessage(Message msg) {
		// TODO Auto-generated method stub
		Boolean rtn = false;
		if(msg.text.contains("Email")) {
			System.out.println("Email error processed: " + msg.priority + " priority, issue: " + msg.text);
			rtn = true;
		}
		if(this._nextReceiver != null) {
			this._nextReceiver.ProcessMessage(msg);
		}
		return rtn;
	}

}
