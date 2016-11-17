package abstractfactory.demo;

public class ActionMovieFactory implements IMovieFactory {

	@Override
	public ITollywoodMovie GetTollywoodMovie() {
		// TODO Auto-generated method stub
		return new TollyActionMovie();
	}

	@Override
	public IBollywoodMovie GetBollywoodMovie() {
		// TODO Auto-generated method stub
		return new BollyActionMovie();
	}

}
