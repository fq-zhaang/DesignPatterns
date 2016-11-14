package command.demo;

public class MyRedoCommand implements ICommand{
	
	private Receiver receiver;
	public MyRedoCommand(Receiver r) {
		this.receiver = r;
	}

	@Override
	public void Do() {
		// TODO Auto-generated method stub
		this.receiver.performRedo();
	}

}
