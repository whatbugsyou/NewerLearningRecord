package OOP3;
//final修饰类不可继承，修饰属性值不可修改,修饰方法不能重写
public class Circle {
	private double radio;
	final double  pi=3.1415926;
	public Circle(double r) {
		radio=r;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public void area() {
		System.out.println("面积"+(radio*radio*pi));
	}
	public void length() {
		System.out.println("周长"+(2*radio*pi));
	}
}
