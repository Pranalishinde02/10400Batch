package Abstraction;

public class Circle1 extends Shape1 {

	private int radius;
	public Circle1()
	{
		
	}
	public Circle1(int radius) {
		super();
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}


	@Override
	public double getArea() {
		return Math.PI*radius*radius;
		
	}
	@Override
	public double getPerimeter() {
		return 2*Math.PI*radius;
		
	}
	@Override
	public String toString() {
		return "Circle radius=" + radius + ", \ngetArea()=" + getArea() + ", \ngetPerimeter()=" + getPerimeter() + "";
	}
		
	}
