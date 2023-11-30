package Interface;

public class Dog implements Animal
{

	@Override
	public void sleep() {
		System.out.println("Dog can sleep above10 hrs");
		
	}

	@Override
	public void eat() {
		System.out.println("can eat all foods");
		
	}

}