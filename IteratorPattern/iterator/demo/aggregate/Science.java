package iterator.demo.aggregate;

import java.util.LinkedList;

import iterator.demo.iterator.IIterator;

public class Science implements ISubject{
	
	private LinkedList<String> subjects;
	
	public Science() {
		this.subjects = new LinkedList<String>();
		this.subjects.addLast("Maths");
		this.subjects.addLast("Com.Sc.");
		this.subjects.addLast("Physics");
	}

	@Override
	public IIterator CreateIterator() {
		// TODO Auto-generated method stub
		return new ScienceIterator(this.subjects);
	}
	
	public class ScienceIterator implements IIterator {
		private LinkedList<String> subjects;
		private int position;
		
		public ScienceIterator(LinkedList<String> subjects) {
			this.subjects = subjects;
			this.position = 0;
		}
		
		@Override
		public void First() {
			// TODO Auto-generated method stub
			this.position = 0;
		}

		@Override
		public String Next() {
			// TODO Auto-generated method stub
			return this.subjects.get(this.position++);
		}

		@Override
		public Boolean IsDone() {
			// TODO Auto-generated method stub
			return this.position >= this.subjects.size();
		}

		@Override
		public String CurrentItem() {
			// TODO Auto-generated method stub
			return this.subjects.get(this.position);
		}
		
	}

}
