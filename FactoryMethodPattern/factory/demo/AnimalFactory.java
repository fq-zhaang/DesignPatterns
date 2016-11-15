package factory.demo;

public class AnimalFactory extends AbsAnimalFactory{

	@Override
	public IAnimal GetAnimal(String type) throws Exception {
		// TODO Auto-generated method stub
		switch(type) {
		case "duck":
			return new Duck();
		case "tiger":
			return new Tiger();
		default:
			throw new Exception("type error.");
		}
	}

}
