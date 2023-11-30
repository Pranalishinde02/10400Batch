package ConditionalStatement;

import java.util.Scanner;

public class AlphabetExa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet:");
	    char alpha=sc.next().charAt(0);
	    switch(alpha)
	    {
	    case 'a':System.out.println("Apple");
	    break;
	    case 'b':System.out.println("Ball");
	    break;
	    case 'c':System.out.println("Cat");
	    break;
	    case 'd':System.out.println("Dog");
	    break;
	    case 'e':System.out.println("Egg");
	    break;
	    case 'f':System.out.println("Fish");
	    break;
	    case 'g':System.out.println("Google");
	    break;
	    case 'h':System.out.println("Hat");
	    break;
	    case 'i':System.out.println("Ice");
	    break;
	    case 'j':System.out.println("Joke");
	    break;
	    default:
	    	System.out.println("NO DATA MATCH..");
	    	
	    }

	}

}
