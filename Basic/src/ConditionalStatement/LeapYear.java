package ConditionalStatement;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       System.out.println("enter the year");
	       int year=sc.nextInt();
	       if(year%4==0)//current year
	       {
	    	   if(year%100==0)
	    	   {
	    		   if(year%400==0)
	    		   {
	    			   System.out.println("century leap year");
	    			   
	    		   }
	    		   else
	    		   {
	    			   System.out.println("century year but not leap year");
	    		   }
	    		   System.out.println("century year");
	    	   }
	    	   else
	    	   {
	    		   System.out.println("its not century year may be leap ");
	    	   }
	    	 System.out.println(" current leap year "); 
	       }
	       else
	       {
	    	   System.out.println("not leap year");
	       }

}
}
