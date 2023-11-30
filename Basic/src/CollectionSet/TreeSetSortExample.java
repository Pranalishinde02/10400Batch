package CollectionSet;

import java.util.TreeSet;

public class TreeSetSortExample {

	public static void main(String[] args) {
		//Tree Set automatically sort the data
		TreeSet <String>set=new TreeSet<String>();
		set.add("java");
		set.add("c");
		set.add("python");
		set.add("java");
		set.add("cloud");
		set.add("html");
		System.out.println(set);
	}

}
