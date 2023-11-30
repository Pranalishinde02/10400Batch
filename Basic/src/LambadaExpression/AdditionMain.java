package LambadaExpression;

public class AdditionMain {

	public static void main(String[] args) {

		Addition a=(x,y)->
		{
			
			return x+y;
		};
		System.out.println(a.add(4, 5));

	}
	
}


