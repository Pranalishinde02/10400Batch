package ConditionalStatement;

import java.util.Scanner;

public class GreaterNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the inputs");
		int x=sc.nextInt();//5
		int y=sc.nextInt();//3
		int z=sc.nextInt();//8
		int max=x;//max=5
		if(max<y)//5<3
		{
			max=y;
		}
		if(max<z)//5<8
		{
			max=z;//max=8
		}
		System.out.println("The Max =:"+max);//max=8


	}

}
