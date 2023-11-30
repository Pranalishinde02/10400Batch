package LambadaExpression;

public class Mref {

	    Mref()
		{
			System.out.println("hello");
		}
	  public static void main(String[] args) {

		//MethodRef m=new MethodRef();
			
			Demo d=MethodRef::new;
			d.demo();

		}

}
