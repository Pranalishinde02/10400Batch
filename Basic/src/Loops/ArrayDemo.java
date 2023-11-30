package Loops;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();//5
		int a[]=new int[size];//0,1,2,3,4
		System.out.println("enter the inputs");
		for(int i=0;i<size;i++)
		{
		 a[i]=sc.nextInt();//a[0]=2,a[1]=4,a[2]=5,a[3]=8,a[4]=77
		}
		System.out.println("enter the outputs");

		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}

	}

}
