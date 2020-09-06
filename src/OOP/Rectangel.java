package OOP;

public class Rectangel extends Shape{
	double chang;
	double kuan;
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("长为"+chang+"宽为"+kuan+"的长方形的面积为："+chang*kuan);
	}

	@Override
	public void length() {
		// TODO Auto-generated method stub
		System.out.println("长为"+chang+"宽为"+kuan+"的长方形的周长为："+2*(chang+kuan));
	}

	public Rectangel(double chang, double kuan) {
		super();
		this.chang = chang;
		this.kuan = kuan;
	}

}
