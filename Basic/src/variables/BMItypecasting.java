package variables;

import java.util.Scanner;

public class BMItypecasting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the weight");
		int weight=sc.nextInt();
		System.out.println("enter the height");
		int height=sc.nextInt();
		double BMI=(double)weight/(height*height);
		System.out.println("The Bmi is=:"+BMI);

	}

}
