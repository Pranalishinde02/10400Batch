package LambadaExpression;

public class FunctionalMain {

	public static void main(String[] args) {

		FunctionalInterfaceExa a=(x,y)->
		{
			
			return x+y;
		};
		System.out.println(a.add(4, 5));
		a.display();

	}

}
