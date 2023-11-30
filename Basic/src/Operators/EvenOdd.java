package Operators;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no to check it is even or odd:");
		int no=sc.nextInt();
		boolean res = no%2==0;
		System.out.println(res);

	}

}
