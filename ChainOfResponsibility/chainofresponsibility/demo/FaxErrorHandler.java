package chainofresponsibility.demo;

public class FaxErrorHandler implements IReceiver {

	private IReceiver _nextReceiver;
	public FaxErrorHandler(IReceiver next) {
		// TODO Auto-generated constructor stub
		this._nextReceiver = next;
	}
	@Override
	public Boolean ProcessMessage(Message msg) {
		// TODO Auto-generated method stub
		Boolean rtn = false;
		if(msg.text.contains("Fax")) {
			System.out.println("Fax error processed: " + msg.priority + " priority, issue: " + msg.text);
			rtn = true;
		}
		if(this._nextReceiver != null) {
			this._nextReceiver.ProcessMessage(msg);
		}
		return rtn;
	}

}
