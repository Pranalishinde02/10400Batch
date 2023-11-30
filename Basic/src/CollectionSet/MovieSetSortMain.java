package CollectionSet;

import java.util.HashSet;
import java.util.TreeSet;

public class MovieSetSortMain {

	public static void main(String[] args) {
		
		MovieSetSortExample m1=new MovieSetSortExample("bahubali","raj",3.4f,4.3f);
		MovieSetSortExample m2=new MovieSetSortExample("Leo","logesh",3.3f,4.4f);
		MovieSetSortExample m3=new MovieSetSortExample("Santhramugi","vasu",3.3f,4.2f);
	
		HashSet<MovieSetSortExample> set=new HashSet<MovieSetSortExample>();
		set.add(m3);
		set.add(m2);
		set.add(m1);
		for(MovieSetSortExample m:set)
		{
			System.out.println(m);
		}
       System.out.println("=============sorting");
       TreeSet<MovieSetSortExample> set1=new TreeSet<MovieSetSortExample>();
       set1.add(m3);
		set1.add(m2);
		set1.add(m1);
		for(MovieSetSortExample m:set1)
		{
			System.out.println(m);
		}
        

	}

}
