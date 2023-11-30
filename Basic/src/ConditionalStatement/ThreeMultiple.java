package ConditionalStatement;

import java.util.Scanner;

public class ThreeMultiple {

	public static void main(String[] args) {
	// Multiple of three
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number..");
		int n =sc.nextInt();
		int start=1;
		while(start<=n)//1<=10
		{
			if(start%3==0)
			{
				
				System.out.println(start);
			}
			start++;
		}

	}

}