package OOP2;

public class Bus extends MotoVehicle {

	int seatCount;
	
	public Bus(int no, String brand, String color, int mileage,int sc) {
		// TODO Auto-generated constructor stub
		super(no, brand, color, mileage);
		if(sc<=0) {
			System.out.println("座位数错误");
			System.exit(0);
		}
		seatCount=sc;
	}
	@Override
	public void calcRent() {
		
		if (seatCount<=0) {
			System.out.println("座位数错误");
			System.exit(0);
		}else if (seatCount > 16) {
			this.rent = 1500;
		} else {
			this.rent = 800;
		} 
		System.out.println(this.seatCount+"坐的公交车一天租金"+this.rent+"元");
		// TODO Auto-generated method stub
		
	}
}
