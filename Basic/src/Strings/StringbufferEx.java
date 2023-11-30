package Strings;

public class StringbufferEx {

	public static void main(String[] args) {
	   
		StringBuffer s = new StringBuffer("Hello");
		System.out.println(s);
		s.append("hai");
		System.out.println(s);
		s.insert(3, "java");
		System.out.println(s);
		s.replace(2, 5, "word");
		System.out.println(s);
		s.reverse();
		System.out.println(s);

	}

}
