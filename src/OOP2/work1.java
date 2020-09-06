package OOP2;
/**
 * 车辆租金
 * 类数组 类名[] 数组名  = new 类名[数组大小];
 * new 的数组没有初始化,都为默认值,类默认为null,int 0,String属于类.
 * 
 * @author Hzl
 *
 */
public class work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotoVehicle[] MV = new MotoVehicle[5];
		MV[0]=new Car(1,"宝马", "黑色", 432,"别克商务舱GL8");
		MV[1]=new Car(1,"宝马", "黑色", 432,"别克林荫大道");
		MV[2]=new Car(1,"宝马", "黑色", 432,"宝马550i");
		MV[3]=new Bus(0, null, null, 0,17);
		MV[4]=new Bus(0, null, null, 0,10);
		for (MotoVehicle motoVehicle : MV) {
			motoVehicle.calcRent();	
		}
	}

}
