package variables;

import java.util.Scanner;

public class Bmivalue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Name:");
		 String name=sc.next();
		 System.out.print("Enter Weight: ");
	     double weight = sc.nextDouble();
	     System.out.print("Enter Height: ");
	     double height = sc.nextDouble();
	     double BMI = weight / (height * height);
	    System.out.print("The(BMI) is " + BMI);
	}

}
