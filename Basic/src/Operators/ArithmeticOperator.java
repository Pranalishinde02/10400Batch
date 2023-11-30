package Operators;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers:");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		int Add=no1+no2;
		int Sub=no1-no2;
		int Mul=no1*no2;
		int Div=no1/no2;
		System.out.println("Addition is:"+Add);
		System.out.println("Substraction is:"+Sub);
		System.out.println("Multiplication is:"+Mul);
		System.out.println("Division is:"+Div);

	}

}
