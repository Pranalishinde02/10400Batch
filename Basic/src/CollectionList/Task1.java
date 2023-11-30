package CollectionList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	       int N=scanner.nextInt();//5
	     
	       ArrayList<Integer>list=new ArrayList<Integer>();
	       for(int i=0;i<N;i++)//5
	       {
	          int element =scanner.nextInt();//12 0 1 78 12
	           list.add(element);//12 0 1 78 12
	       }
	     int Q =scanner.nextInt();//2
	       for(int i=0;i<Q;i++)//0<2
	       {
	             int x;
	            int y;
	           String query=scanner.next();//Insert or Delete
	         
	           if(query.equals("Insert"))
	           {
	               x=scanner.nextInt();//5
	               y =scanner.nextInt();//23
	               list.add(x,y);
	           }
	           else{
	                 x=scanner.nextInt();//0
	                 list.remove(x);//12
	               
	           }
	       }
	       for(int i=0;i<list.size();i++)
	       {
	           System.out.print(list.get(i)+" ");//0 1 78 12 23
	       }
	}

}
