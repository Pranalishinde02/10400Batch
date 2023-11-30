package variables;

import java.util.Scanner;

public class Runtimestudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID:");
		int id = sc.nextInt();
		System.out.println("Enter Student Name:");
		String name=sc.next();
		System.out.println("Enter Student Address:");
		String add=sc.next();
		System.out.println("Enter Student Marks:");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();
		int total = m1+m2+m3+m4+m5;
		double per =(total*100)/500.0;
		System.out.println("The Student id=:"+id);
		System.out.println("The Student Name=:"+name);
		System.out.println("The adress is=:"+add);
		System.out.println("The Total=:"+total);
		System.out.println("The percentage=:"+per);
	}

}
