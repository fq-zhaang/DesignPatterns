package interpreter.demo;

public class InToWords implements IExpression {
	
	private String str;
	
	public InToWords(String s) {
		// TODO Auto-generated constructor stub
		this.str = s;
	}

	@Override
	public void interpret(Context ic) {
		// TODO Auto-generated method stub
		ic.printInWords(this.str);
	}

}
