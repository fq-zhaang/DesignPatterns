package chainofresponsibility.demo;

public class ChainRun {
	
	public static void main(String[] args) {
		IReceiver fax, email;
		email = new EmailErrorHandler(null);
		fax = new FaxErrorHandler(email);
		
		IssueRaiser r = new IssueRaiser(fax);
		Message m1 = new Message("Fax is reaching late to the destination.", MessagePriority.Normal);
		Message m2 = new Message("Email is not going.", MessagePriority.High);
		Message m3 = new Message("In Email, BCC field is disabled occasionally.", MessagePriority.Normal);
		Message m4 = new Message("Fax is not reaching to Email.", MessagePriority.High);
		
		r.RaiseMessage(m1);
		r.RaiseMessage(m2);
		r.RaiseMessage(m3);
		r.RaiseMessage(m4);
		
	}

}
