package ExceptionHandling;

public class ArithmeticExceptionHandling {

	public static void main(String[] args) {
		try
		{
			int i=9,j=0;
		    int k=i/j;
		    System.out.println(k);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}