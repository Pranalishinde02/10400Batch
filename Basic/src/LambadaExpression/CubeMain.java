package LambadaExpression;

public class CubeMain {

	public static void main(String[] args) {

		Cube c =(a)->
		{
			return a*a*a;
		};
		System.out.println(c.cube(10));

	}

}
