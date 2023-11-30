package Interface;

public class Dog1 implements Animal1 {
	
	@Override
	public void sleep() {
		System.out.println("Dog can sleep above10 hrs");
		
	}

	@Override
	public void eat() {
		System.out.println("can eat all foods");
		
	}


}
