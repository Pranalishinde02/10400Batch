package LambadaExpression;

public class MethodReference {

	static void display()
	{
		System.out.println("hello");
	}
	
    public static void main(String[] args) {
			//MethodRef m=new MethodRef();
			
			Demo d=MethodReference::display;
			d.demo();

		}
    
}
