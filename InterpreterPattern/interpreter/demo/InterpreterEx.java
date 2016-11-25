package interpreter.demo;

import java.util.Scanner;

public class InterpreterEx {
	
	public Context ic = null;
	public IExpression exp = null;
	public InterpreterEx(Context c) {
		// TODO Auto-generated constructor stub
		this.ic = c;
	}
	public void interpret(String str) {
		Scanner in = new Scanner(System.in);
		for(int i = 0;i < 2; i++) {
			System.out.println("Enter your choice: ");
			String c = in.nextLine();
			if(c.equals("1")) {
				exp = new InToWords(str);
				exp.interpret(this.ic);
			}else {
				exp = new StringToBinaryExp(str);
				exp.interpret(this.ic);
			}
		}
		in.close();
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		Context ic = new Context(input);
		InterpreterEx client = new InterpreterEx(ic);
		client.interpret(input);
		in.close();
	}

}
