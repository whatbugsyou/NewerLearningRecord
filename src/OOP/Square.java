package OOP;

public class Square extends Shape {
	double bianchang;

	public Square(double bianchang) {
		super();
		this.bianchang = bianchang;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("边长为" + bianchang + "的正方形面积为：" + bianchang * bianchang);
	}

	@Override
	public void length() {
		// TODO Auto-generated method stub
		System.out.println("边长为" + bianchang + "的正方形周长为：" + (4 * bianchang));
	}

}
