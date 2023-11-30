package Operators;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Persons Age:");
     int Age=sc.nextInt();
     boolean res=(Age>18);
     System.out.println("Checking Eligiblity:"+res);
     
	}
}
