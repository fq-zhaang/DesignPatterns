package iterator.demo.run;

import iterator.demo.aggregate.Arts;
import iterator.demo.aggregate.ISubject;
import iterator.demo.aggregate.Science;
import iterator.demo.iterator.IIterator;

public class IteratorRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISubject sc = new Science();
		ISubject ar = new Arts();
		
		IIterator sc_i = sc.CreateIterator();
		IIterator ar_i = ar.CreateIterator();
		Print(sc_i);
		Print(ar_i);
	}
	
	public static void Print(IIterator iterator) {
		while (!iterator.IsDone()) {
			System.out.println(iterator.Next());
		}
	}

}
