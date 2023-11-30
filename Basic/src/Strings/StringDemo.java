package Strings;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		
		String s="  Hello ";//literal
		String s1=new String(" Hello   ");//object
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s.charAt(0));//H
		System.out.println(s.indexOf('H'));//0
		System.out.println(s.concat("hai"));//hellohai
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.contains("H"));
		System.out.println(s.equals(s1));
		System.out.println(s.startsWith(s1));
		System.out.println(s.endsWith(s));
		System.out.println(s.trim());
		System.out.println(s.length());
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.compareTo(s1));
		    //s1 eqaul to s2==>0
		    //s1 higher than s2 ==>positive
		     //s1 lessthan s2==>negative
		    
		System.out.println(s==s1);//check the memory
		
		//string to character conversion
	    char a[]=s.toCharArray();
	    for(int i=0;i<a.length;i++)
	    {
	    	System.out.println(a[i]);
	    }
	    
	    String data = "JAVA";
	    char[] dest=new char[4];
	    data.getChars(0,4,dest,0);//start,endposition,char array variable na,e
	    //start pos
	    System.out.println(Arrays.toString(dest));
	    //string to character conversion
	    char a1[]=data.toCharArray();
	    for(int i=0;i<a1.length;i++)
	    {
	    	System.out.println(a1[i]);
	    }
	    
	    
	    char[] dest1=new char[6];
	    data.getChars(3,9,dest1,0);//start,endposition,char array variable na,e
	    //start pos
	    System.out.println(Arrays.toString(dest1));
	    System.out.println(s1.isEmpty());
	    System.out.println(s1.isBlank());
	    System.out.println(s.stripLeading());
	    System.out.println(s1.stripTrailing());
	    System.out.println(s.repeat(4));
	    System.out.println(s.contentEquals(s1));
		    
		
	}
}
