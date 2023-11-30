package LambadaExpression;

import java.util.Arrays;
import java.util.List;

public class ListExa {

	public static void main(String[] args) {
		
     List<Integer> list= Arrays.asList(12,13,14,14,16,17);
		
		for(Integer i:list)
		{
			System.out.println(i);
		}
        System.out.println("lambada ");
        list.forEach(x->System.out.println(x));
        }

	}


