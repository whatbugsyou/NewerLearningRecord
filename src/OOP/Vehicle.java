package OOP;

public class Vehicle {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setSize(100);
		vehicle.setSpeed(10);
		vehicle.speedUp();
		vehicle.speedDown();
	}
	private double size;
	private int speed;
	public double getSize() {
		return size;
	}
	public int getSpeed() {
		return speed;
	}
	public void move() {
		
	}
	public void setSize(double size) {
		this.size = size;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	public void speedDown() {
		speed--;
		System.out.println("当前速度为"+speed);
	}
	public void speedUp() {
		speed++;
		System.out.println("当前速度为"+speed);
	}
}
