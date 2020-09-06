package OOP;

public class Student {
	int studentNum;
	String name;
	
	public Student() {
		
	}
	public Student(int num,String name) {
		this.studentNum = num;
		this.name = name;
	}
	public void describe() {
		System.out.println("studentNum"+studentNum+ "  " +"name="+name);
	}
	@Override
	public String toString() {
		return "Student [studentNum=" + studentNum + ", name=" + name + "]";
	}
}
