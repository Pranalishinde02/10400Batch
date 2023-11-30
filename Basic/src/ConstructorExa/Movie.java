package ConstructorExa;

public class Movie {
	
	
	private String movieName;
	private String duration;
	private String ratings;
	private String director;
	
	
	public Movie()
	{
		
	}
	
	public Movie( String movieName, String duration, String ratings, String director) {
		super();
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

	
	public String toString() {
		return "NAME:"+movieName+"\nDURATION:"+duration+"\nRATINGS:"+ratings+""
				+ "\nDIRECTOR:"+director+"";
	
	}
	

}
