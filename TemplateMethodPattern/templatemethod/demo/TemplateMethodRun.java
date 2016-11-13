package templatemethod.demo;

import engineering.papers.BasicEngineering;
import engineering.papers.ComputerScience;
import engineering.papers.Electronics;

public class TemplateMethodRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicEngineering basic = new ComputerScience();
		basic.Papers();
		basic = new Electronics();
		basic.Papers();

	}

}
