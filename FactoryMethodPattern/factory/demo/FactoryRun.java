package factory.demo;

public class FactoryRun {
	
	public static void main(String[] args) throws Exception{
		AbsAnimalFactory a = new AnimalFactory();
		IAnimal duck = a.GetAnimal("duck");
		duck.Speak();
		IAnimal tiger = a.GetAnimal("tiger");
		tiger.Speak();
	}

}
