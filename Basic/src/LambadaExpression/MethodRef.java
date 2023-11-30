package LambadaExpression;

public class MethodRef {

	void display()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {

        MethodRef m=new MethodRef();
		Demo d=m::display;
		d.demo();

	}
		
}


