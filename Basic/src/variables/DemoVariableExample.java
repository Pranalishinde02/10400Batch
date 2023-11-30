package variables;

public class DemoVariableExample {

	int i;//class variable or instance 
	DemoVariableExample(int j)//local variable
	{
		i=j;
		System.out.println(i);
	}
	void display()
	{
		System.out.println(i);
	}
}
