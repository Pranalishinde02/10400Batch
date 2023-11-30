package CollectionSet;

import java.util.HashSet;

public class NumberHashSet {

	public static void main(String[] args) {
		
		HashSet<Integer> n = new HashSet<Integer>();
		n.add(10);
		n.add(20);
		n.add(30);
		n.add(40);
		n.add(50);
		n.add(60);
		n.add(70);
		System.out.println("The HashSet is:"+n);

		HashSet<Integer> no = new HashSet<Integer>();
		no.addAll(n);
		no.add(5);
		System.out.println("The New HashSet:"+no);
	}

}
