package ExceptionHandling;

public class StudentMain {

	public static void main(String[] args) {
		Student p1 = new Student("Pranali",40,20,30,35,20);
		System.out.println(p1);
		Eligibility(p1);
	}
	
	public static void Eligibility(Student p)
	{
		if(p.per()>50)
		{
			System.out.println("Student is eligible for interview.");
		}
		else
		{
			try
			{
				throw new NotEligibleForInterviewException("Student is not eligible for interview.");
			}
			catch(NotEligibleForInterviewException e)
			{
				System.out.println(e);
			}
		}
	}

}
