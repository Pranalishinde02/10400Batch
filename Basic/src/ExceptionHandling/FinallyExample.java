package ExceptionHandling;

public class FinallyExample {

	public static void main(String[] args) {
		
			int k=0;
			try
			{
			int i=9,j=0;
					k=i/j;
			System.out.println("hello");
			System.out.println(k);
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			finally
			{
				System.out.println(k);
				
			}
		
		}

	}

