package abstractfactory.demo;

public class ComedyMovieFactory implements IMovieFactory {

	@Override
	public ITollywoodMovie GetTollywoodMovie() {
		// TODO Auto-generated method stub
		return new TollyComedyMovie();
	}

	@Override
	public IBollywoodMovie GetBollywoodMovie() {
		// TODO Auto-generated method stub
		return new BollyComedyMovie();
	}

}
