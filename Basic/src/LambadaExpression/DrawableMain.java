package LambadaExpression;

public class DrawableMain {

	public static void main(String[] args) {

		Drawable D = ()->
		{
			System.out.println("Hello there");
		};
		D.draw();
	}
}


