package OOP2;

public class Car extends MotoVehicle {
	public Car(int no, String brand, String color, int mileage,String type) {
		super(no, brand, color, mileage);
		this.type=type;
		// TODO Auto-generated constructor stub
	}

	String type;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void calcRent() {
		// TODO Auto-generated method stub
		switch (type) {//switch匹配String
			case "别克商务舱GL8": this.rent=600;break;
			case "宝马550i":this.rent=500;break;
			case "别克林荫大道":this.rent=300;break;
		default:
			System.out.println("不存在"+this.type+"轿车");
			this.rent=0;
		}
		if(rent!=0){
			System.out.println(type+"轿车一天的租金为"+rent);
		}
	}
	
}
