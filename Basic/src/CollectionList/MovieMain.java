package CollectionList;

import java.util.ArrayList;
import java.util.List;

import LambadaExpression.Employee;

public class MovieMain {

	public static void main(String[] args) {
		
		Movie m1 = new Movie("Raw","2hr","5","abc");
		Movie m2 = new Movie("Ravan","2hr","4","xyz");
		Movie m3 = new Movie("Ramleela","2hr","4.5","pqr");

		ArrayList<Movie> mlist = new ArrayList<Movie>();
		mlist.add(m1);
		mlist.add(m2);
		mlist.add(m3);
		for(Movie m:mlist)
		{
			System.out.println(m);
		}
		System.out.println("Movie Ratings.");	
		MaxRating(mlist);
		System.out.println("Movie Duration.");	
		MaxDuration(mlist);
	}

	public static void MaxRating(mlist<Movie> m)
	{
		for(Movie list:m)
        {
            if(mlist.getRatings()>"4.5")
            {
                System.out.println(list.getMovieName());
                System.out.println(list.getRatings());
            }
        }
                
	}
	
	public static void MaxDuration(mlist<Movie> m)
	{
		for(Movie list:m)
		{
            {
                System.out.println(list.getMovieName());
                System.out.println(list.getDuration());
            }
                
		}
		
	}
}
