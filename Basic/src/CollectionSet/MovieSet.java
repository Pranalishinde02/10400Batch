package CollectionSet;

public class MovieSet {
	
	private int movieId;
	private String movieName;
	private String duration;
	private String ratings;
	private String director;
	private static int idgen=1;
	
	public MovieSet()
	{
		movieId=idgen;
	}
	
	public MovieSet(String movieName, String duration, String ratings, String director) {
		this();
		this.movieName = movieName;
		this.duration = duration;
		this.ratings = ratings;
		this.director = director;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getRatings() {
		return ratings;
	}

	public void setRatings(String ratings) {
		this.ratings = ratings;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "MovieSet [movieId=" + movieId + ", movieName=" + movieName + ", duration=" + duration + ", ratings="
				+ ratings + ", director=" + director + "]";
	}

}
