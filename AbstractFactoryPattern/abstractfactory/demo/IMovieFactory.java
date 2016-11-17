package abstractfactory.demo;

public interface IMovieFactory {
	
	public ITollywoodMovie GetTollywoodMovie();
	public IBollywoodMovie GetBollywoodMovie();

}
