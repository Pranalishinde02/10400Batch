package ExceptionHandling;

public class AgeValidation {

	public static void validate(int age) throws Exception {
		
		if(age>18)
		{
			System.out.println("welcome to vote");
		}
		else
		{
			throw new Exception("not eligible for vote");
		}
	 }

	public static void main(String[] args) throws Exception {
		validate(17);

	}

}

