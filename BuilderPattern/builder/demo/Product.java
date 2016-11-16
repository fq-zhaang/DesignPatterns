package builder.demo;

import java.util.LinkedList;

public class Product {
	
	private LinkedList<String> parts;
	
	public Product() {
		this.parts = new LinkedList<String>();
	}
	
	public void Add(String part) {
		parts.addLast(part);
	}
	
	public void Show() {
		for( int i = 0;i < parts.size(); i++ ) {
			System.out.println(parts.get(i));
		}
	}

}
