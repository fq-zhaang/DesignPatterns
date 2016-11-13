package strategy.demo;

import java.util.Scanner;

import choices.*;
import contextofchoice.Context;

public class StrategyRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		IChoice ic = null;
		Context context = new Context();
		String a, b;
		try {
			for(int i = 1; i <= 2; i++){
				System.out.println("run " + i + " time.");
				a = in.nextLine();
				b = in.nextLine();
				String c = in.nextLine();
				if( c.equals("1")){
					ic = new FirstChoice();
				} else {
					ic = new SecondChoice();
				}
				context.setChoice(ic);
				context.showChoice(a, b);
			}
		} finally {
			in.close();
		}
	}

}
