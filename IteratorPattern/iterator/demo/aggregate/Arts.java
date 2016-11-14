package iterator.demo.aggregate;

import iterator.demo.iterator.IIterator;

public class Arts implements ISubject {
	
	private String[] subjects;
	
	public Arts() {
		this.subjects = new String[2];
		this.subjects[0] = "Bengali";
		this.subjects[1] = "English";
	}

	@Override
	public IIterator CreateIterator() {
		// TODO Auto-generated method stub
		return new ArtsIterator(this.subjects);
	}
	
	public class ArtsIterator implements IIterator {
		
		private String[] subjects;
		private int position;
		public ArtsIterator(String[] subjects){
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
			return this.subjects[this.position++];
		}

		@Override
		public Boolean IsDone() {
			// TODO Auto-generated method stub
			return this.position >= this.subjects.length;
		}

		@Override
		public String CurrentItem() {
			// TODO Auto-generated method stub
			return this.subjects[this.position];
		}
		
	}

}
