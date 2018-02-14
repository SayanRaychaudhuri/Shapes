
public class Circle extends Shape{
	private double myRadius;
	
	public Circle(double radius, String name) {
		super(name);
		myRadius = radius;
	}
	
	public double area() {
		return Math.PI * Math.pow(myRadius, 2);
	}
	
	public double perimeter() {
		return 2 * Math.PI * myRadius;
	}
	
	public String toString() {
		return "Shape Name: " + getName() + "\n" + "Circumference: " + perimeter()
		+ "\n" + "Semicircumference: " + semiperimeter() + "\n" + 
		"Area: " + area();
	}
}
