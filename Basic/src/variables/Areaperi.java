package variables;

import java.util.Scanner;

public class Areaperi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pi:");
		double pi= sc.nextDouble();
		System.out.println("Enter r");
		double r=sc.nextDouble();
		double ap = 2*pi*r;
		System.out.println("Area of perimeter is:"+ap);

	}

}
