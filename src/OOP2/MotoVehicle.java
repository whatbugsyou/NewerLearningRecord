package OOP2;
/**
 * 抽象类abstract 
 * 有构造方法给子类调用
 * 不能创建对象
 * @author Hzl
 *
 */
public abstract class MotoVehicle {
	int no;
	String brand;
	String color;
	int mileage;
	int rent;
	abstract void calcRent();
	public MotoVehicle() {
		// TODO Auto-generated constructor stub
	}
	public MotoVehicle(int no,String brand,String color,int mileage) {
		// TODO Auto-generated constructor stub
		this.brand=brand;
		this.no=no;
		this.color=color;
		this.mileage=mileage;
	}
	
}
