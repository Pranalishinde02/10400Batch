package LambadaExpression;

import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<Integer> ();
		list.add(12);
		list.add(37);
		list.add(90);

		list.add(88);
        list.add(88);
		list.add(89);
		for(Integer i:list)
		{
			System.out.println(i);
		}
        System.out.println("lambada ");
        list.forEach(x->System.out.println(x));
        }
	}


