package abstractfactory.demo;

public class AbstractRun {
	
	public static void main(String[] args) {
		ActionMovieFactory actionMovieFactory = new ActionMovieFactory();
		ITollywoodMovie tAction = actionMovieFactory.GetTollywoodMovie();
		IBollywoodMovie bAction = actionMovieFactory.GetBollywoodMovie();
		System.out.println(tAction.MovieName());
		System.out.println(bAction.MovieName());
		
		ComedyMovieFactory comedyMovieFactory = new ComedyMovieFactory();
		ITollywoodMovie tComedy = comedyMovieFactory.GetTollywoodMovie();
		IBollywoodMovie bComedy = comedyMovieFactory.GetBollywoodMovie();
		
		System.out.println(tComedy.MovieName());
		System.out.println(bComedy.MovieName());
		System.out.println(tComedy.getClass());
	}

}
