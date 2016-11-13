package contextofchoice;

import choices.IChoice;

public class Context {
	IChoice myc;
	public void setChoice(IChoice ic) {
		this.myc = ic;
	}
	
	public void showChoice(String s1, String s2) {
		myc.myChoice(s1, s2);
	}
}
