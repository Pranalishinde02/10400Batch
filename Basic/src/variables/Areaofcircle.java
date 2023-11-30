package variables;

import java.util.Scanner;

public class Areaofcircle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pi:");
		double pi= sc.nextDouble();
		System.out.println("Enter r");
		double r=sc.nextDouble();
		double perimeter=pi*r*r;
		System.out.println("Area of circle:"+perimeter);

	}

}
