package command.demo;

public class MyUndoCommand implements ICommand {
	
	private Receiver receiver;
	
	public MyUndoCommand(Receiver r) {
		this.receiver = r;
	}

	@Override
	public void Do() {
		// TODO Auto-generated method stub
		receiver.performUndo();
	}
	
}
