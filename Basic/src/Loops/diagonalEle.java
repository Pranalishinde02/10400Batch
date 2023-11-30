package Loops;

import java.util.Scanner;

public class diagonalEle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row and col");
		int row=sc.nextInt();//2
	    int col=sc.nextInt();	//2	
		int a[][]=new int[row][col];//00,01,10,11
		System.out.println("Enter two array");
	     for(int i=0;i<row;i++)//0<2 1<2
	     {
	    	 for(int j=0;j<col;j++)//0<2 1<2 2<2=f
	    		                  //0<2 1<2
	    	 {
	    		 a[i][j]=sc.nextInt();//00=12 01=13
	    		                      //10=14  11=15
	    	 }
	     }
	     for(int i=0;i<row;i++)//0<2 1<2
	     {
	    	 for(int j=0;j<col;j++)//0<2 1<2 2<2=f
	    		                   //0<2 1<2
	    	 {
	    		 if(i==j)//0==0 0==1 1==0 1==1
	    		 {
	    			 System.out.print(a[i][j]);//1 s
	    			                           //s  4
	    		 }
	    		 else
	    		 {
	    			 System.out.print(" ");
	    		 }
	    	 }
	    	 System.out.println();
	     }
	     
		
	     
	}

}
