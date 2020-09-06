package OOP;

public class work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu_n = new Student();
		Student stu_y = new Student(1,"张三");
		Teacher tea_n = new Teacher();
		Teacher tea_y = new Teacher(1,"李四");
		stu_n.describe();
		stu_y.describe();
		tea_n.describe();
		tea_y.describe();
	}
}
