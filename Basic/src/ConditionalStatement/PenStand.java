package ConditionalStatement;

import java.util.Scanner;

public class PenStand {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Pens do you Want:");
		int n=sc.nextInt();
		if(n==5)
		{
			System.out.println("Yes pen Stand can can hold 5 pens.");
		}
		else if(n>5)
		{
			System.out.println("Pen Stand is full because it exceeds 5 pens");
		}
	}

}
