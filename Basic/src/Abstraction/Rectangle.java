package Abstraction;

public class Rectangle extends Shape1 {
	
	private double length;
	private double width;
	
	Rectangle()
	{
		
	}

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		return length*width;
	}

	@Override
	public double getPerimeter() {
		return 2*(length+width);
	}

	@Override
	public String toString() {
		return "Rectangle length=" + length + ",\nRectangle width=" + width + ", \ngetArea()=" + getArea() + ", \ngetPerimeter()="
				+ getPerimeter() + "";
	}
	
	
	

}
