package CollectionMap;

import java.util.TreeMap;

public class TreeMapSortExample {

	public static void main(String[] args) {

		//Tree Map automatically sort the data
		TreeMap<Integer,String>map=new TreeMap<Integer,String>();
		map.put(1, "apple");
		map.put(2,"orange");
		map.put(2, "banana");
		map.put(3, "grapes");
		map.put(5, "orange");
		map.put(4, "dragon fruit");
		System.out.println(map);

	}
}
