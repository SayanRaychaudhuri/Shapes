
public class Square extends Rectangle{
	private double mySide;
	
	public Square(double side, String name) {
		super(side, side, name);
		mySide = side;
	}

	public double area() {
		return Math.pow(mySide, 2);
	}

	public double perimeter() {
		return 4 * mySide;
	}
	
	public String toString() {
		return "Shape Name: " + getName() + "\n" + "Perimeter: " + perimeter()
		+ "\n" + "Semiperimeter: " + semiperimeter() + "\n" + 
		"Area: " + area();
	}
}
