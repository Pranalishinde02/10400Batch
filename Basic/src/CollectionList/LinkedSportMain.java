package CollectionList;

import java.util.LinkedList;

public class LinkedSportMain {

	public static void main(String[] args) {
		
		LinkedList<LinkedSportExample> list = new LinkedList<LinkedSportExample>();
		list.add(new LinkedSportExample("Cricket"));
		list.add(new LinkedSportExample("Chess"));
		list.add(new LinkedSportExample("Football"));
		list.add(new LinkedSportExample("Kabbadi"));
		list.add(new LinkedSportExample("Tennis"));
		
		for(LinkedSportExample l:list)
		{
			System.out.println(l);
		}
		
	}

}
