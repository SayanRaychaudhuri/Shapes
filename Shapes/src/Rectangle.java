
public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(double length, double width, String name) {
		super(name);
		this.length = length;
		this.width = width;
	}

	public double area() {
		return length * width;
	}

	public double perimeter() {
		return 2 * length + 2 * width;
	}
	
	public String toString() {
		return "Shape Name: " + getName() + "\n" + "Perimeter: " + perimeter()
		+ "\n" + "Semiperimeter: " + semiperimeter() + "\n" + 
		"Area: " + area();
	}
}
