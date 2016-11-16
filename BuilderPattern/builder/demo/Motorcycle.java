package builder.demo;

public class Motorcycle implements IBuilder {

	private Product product = new Product();

	@Override
	public void BuildBody() {
		// TODO Auto-generated method stub
		product.Add("body of a motocycle.");
	}

	@Override
	public void InsertWheels() {
		// TODO Auto-generated method stub
		this.product.Add("2 wheels of a motocycle.");
	}

	@Override
	public Product Getvehicle() {
		// TODO Auto-generated method stub
		return this.product;
	}

	@Override
	public void AddHeadlights() {
		// TODO Auto-generated method stub
		this.product.Add("1 headlights of a motocycle.");
	}

}
