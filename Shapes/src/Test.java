
public class Test {

	public static void main(String[] args) {
		Circle circle = new Circle(5,"lol");
		Shape[] shape = new Shape[3];
		shape[0] = circle;
		shape[1] = new Square(5,"zoom");
		shape[2] = new Rectangle(5,5,"reverselol");

		for(int i=0;i<shape.length;i++) {
			if (i==0) {
				System.out.println("Diameter: " + circle.area()/Math.PI + "\n" + circle.toString());
			} else {
				System.out.println(shape[i].toString());
			}
		}
		
	}

}
