package OOP2;

public class Employee extends Person {
	int eId;
	public void work() {
		System.out.println("工作");
	}
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.talk();
		employee.work();
	}
}
