package command.demo;

public class CommandRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receiver re = new Receiver();
		Invoke in = new Invoke();
		MyUndoCommand u = new MyUndoCommand(re);
		MyRedoCommand r = new MyRedoCommand(re);
		in.ExecuteCommand(r);
		in.ExecuteCommand(u);

	}

}
