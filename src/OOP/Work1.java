package OOP;

public class Work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shape = new Shape[3];
		shape[0] = new Circle(1.0);
		shape[1] = new Rectangel(2.0, 3.0);
		shape[2] = new Square(3.0);
		for (Shape shape2 : shape) {
			shape2.area();
			shape2.length();
		}

	}

}
