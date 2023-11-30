package Strings;
import java.util.Scanner;

public class ReverseE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the word");
		String word=sc.next();//java
		String orginal=word;
		String rev="";
		for(int i=word.length()-1;i>=0;i--)//3>=0 2>=0 1>=0 0>=0
		{
			rev=rev+word.charAt(i);//avaj
		}
		System.out.println(rev);//avaj
		
		if(word.equals(rev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("it is not a palindrome");
		}

	}

}
