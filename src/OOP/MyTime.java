package OOP;

public class MyTime {
	private int hour;
	private int minite;
	private int second;
	public MyTime(int h,int m,int s) {
		hour=h;
		minite=m;
		second=s;
	}
	public void display() {
		System.out.println(hour+"时"+minite+"分"+second+"秒");
	}
	public void addSecond(int sec){
		this.second+=sec;
		addMinite(this.second/60);
		this.second%=60;
	}
	public void addMinite(int min){
		this.minite+=min;
		addHour(this.minite/60);
		this.minite%=60;
	}
	public void addHour(int hou){
		this.hour+=hou;
		this.hour%=24;
	}
	public void subSecond(int sec){
		second-=sec;
		
	}
	public void subMinite(int min){
		minite-=min;
		subHour(minite/=60);
		
	}
	public void subHour(int hou){
		hour-=hou;
		hour%=24;
		hour+=24;
		hour%=24;//考虑如果hour为0
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTime myTime = new MyTime(10, 2, 34);
		myTime.subHour(44);
		myTime.display();
		System.out.println((-10)%1);
	}

}
