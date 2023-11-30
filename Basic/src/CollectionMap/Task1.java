package CollectionMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Task1 {

	public static void main(String[] args) {
		 
	      HashMap<Character,List<String>>map=new HashMap<Character,List<String>>();
	      String s;
	      do
	      {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("enter the alphabets");
	      char alphabet =sc.next().charAt(0);
	      List <String>avalue=new ArrayList<String>();

	      switch(alphabet)
	      {
	          case 'A','a':
	              avalue.add("apple");
	              avalue.add("aeroplane");
	              avalue.add("ant");
	              map.put(alphabet, avalue); 
	              //System.out.println(map);
	              break;
	          case 'B','b':
	              avalue.add("banana");
	              avalue.add("ball");
	              avalue.add("bowl");
	              map.put(alphabet, avalue);
	              //System.out.println(map);
	              break;
	          case 'C','c':
	              avalue.add("cat");
	              avalue.add("camel");
	              avalue.add("cow");
	              map.put(alphabet, avalue); 
	              //System.out.println(map);
	              break;
	      }
	      System.out.println(map);
	      System.out.println("do u want to continue");
	      s=sc.next();
	      
	    } while(s.equals("yes"));
	     
	 }
}
