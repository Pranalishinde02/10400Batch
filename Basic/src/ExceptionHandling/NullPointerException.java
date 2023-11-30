package ExceptionHandling;

public class NullPointerException {

	public static void main(String[] args) {
		{
			try
			{
			String s="Hello";
			String s1=null;
			if(s1.equals(s))
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

		}

	}

}
