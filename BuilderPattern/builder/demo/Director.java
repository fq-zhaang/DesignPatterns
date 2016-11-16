package builder.demo;

public class Director {
	
	IBuilder b;
	
	public void Construct(IBuilder builder) {
		this.b = builder;
		this.b.BuildBody();
		this.b.InsertWheels();
		this.b.AddHeadlights();
	}

}
