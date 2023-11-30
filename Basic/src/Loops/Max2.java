package Loops;

import java.util.Scanner;

public class Max2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();//5
		int a[]=new int[size];//0,1,2,3,4
		int max=a[0];//3
		System.out.println("enter the inputs");
		for(int i=0;i<size;i++)//0<4 1<4 2<4 3<4  4<5
		{
			a[i]=sc.nextInt();//a[0]=3,a[1]=4,a[2]=5,a[3]=6,a[4]=7
			if(max<a[i])//3<3 3<4 4<5 5<6 6<7
			{
				max=a[i];//max=4 max=5 max=6 max=7
			}
		}
		System.out.println(max);//7
		
	}

}
