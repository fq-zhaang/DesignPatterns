package interpreter.demo;

public class StringToBinaryExp implements IExpression {
	
	private String str;
	
	public StringToBinaryExp(String s) {
		// TODO Auto-generated constructor stub
		this.str = s;
	}
	@Override
	public void interpret(Context ic) {
		// TODO Auto-generated method stub
		ic.getBinaryForm(this.str);
	}

}
