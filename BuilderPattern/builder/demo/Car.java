package builder.demo;

public class Car implements IBuilder {
	
	private Product product = new Product();

	@Override
	public void BuildBody() {
		// TODO Auto-generated method stub
		product.Add("body of a car.");
	}

	@Override
	public void InsertWheels() {
		// TODO Auto-generated method stub
		this.product.Add("4 wheels of a car.");
	}

	@Override
	public Product Getvehicle() {
		// TODO Auto-generated method stub
		return this.product;
	}

	@Override
	public void AddHeadlights() {
		// TODO Auto-generated method stub
		this.product.Add("2 headlights of a car.");
	}

}
