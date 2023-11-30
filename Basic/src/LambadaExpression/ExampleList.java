package LambadaExpression;

import java.util.Arrays;
import java.util.List;

public class ExampleList {

	public static void main(String[] args) {
    List<Integer> list= Arrays.asList(12,13,14,14,16,17);
	
       for(Integer i:list)
		{
			System.out.println(i);
		}
		System.out.println("single line lambada ");
		list.forEach(x->System.out.println(x));
		System.out.println("multi line lambada ");

		list.forEach(x->{
		x=x+2;
		System.out.println(x);
		});
//
//list.forEach(x->{
//int y=x+2;
//System.out.println(y);
//});
}
}


