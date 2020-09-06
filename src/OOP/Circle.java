package OOP;

public class Circle extends Shape {
	double radio;
	final double pi = 3.1415;

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("半径为" + radio + "的圆的面积为：" + pi * radio * radio);
	}

	@Override
	public void length() {
		// TODO Auto-generated method stub
		System.out.println("半径为" + radio + "的圆的周长为：" + pi * radio * 2);
	}

	public Circle(double radio) {
		super();
		this.radio = radio;
	}

}
