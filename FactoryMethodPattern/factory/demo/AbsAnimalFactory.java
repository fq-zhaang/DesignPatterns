package factory.demo;

public abstract class AbsAnimalFactory {
	
	public abstract IAnimal GetAnimal(String type) throws Exception;

}
