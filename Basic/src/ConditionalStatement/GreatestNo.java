package ConditionalStatement;

import java.util.Scanner;

public class GreatestNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers:");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		int no3=sc.nextInt();
		if(no1>=no2 && no1>=no3)
		{
			System.out.println("No 1 is the Greatest..");
		}
		else if(no2>=no1 && no2>=no3)
		{
			System.out.println("No 2 is the Grestest..");
		}
		else if(no3>=no1 && no3>=no2)
		{
			System.out.println("No 3 is the Greatest..");
		}

	}

}
