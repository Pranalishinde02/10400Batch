package LambadaExpression;

public interface FunctionalInterfaceExa {

	public int add(int x,int y);
	default void display()
	{
		System.out.println("hello");
	}
}
