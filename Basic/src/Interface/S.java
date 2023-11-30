package Interface;

public class S implements Q,R{

	@Override
	public void p() {
		System.out.println("This method is from p class.");
		
	}

	@Override
	public void r() {
		System.out.println("This method is from r class.");
		
	}

	@Override
	public void q() {
		System.out.println("This method is from q class.");
		
	}

}
