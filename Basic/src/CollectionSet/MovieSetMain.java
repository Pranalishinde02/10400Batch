package CollectionSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

import ConstructorExa.Movie;

public class MovieSetMain {

	public static void main(String[] args) {
		
		MovieSet m1 = new MovieSet("one","2hr","5star","Abc");
		MovieSet m2 = new MovieSet("Tiger3","2hr","5star","Kabir");
		HashSet <MovieSet>set=new HashSet<MovieSet>();
		set.add(m1);
		set.add(m2);
		System.out.println(set);
	}

}
