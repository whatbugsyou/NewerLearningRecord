package OOP;

public class Teacher {
	int TeacherNum;
	String name;
	
	public Teacher() {
		
	}
	public Teacher(int num,String name) {
		this.TeacherNum = num;
		this.name = name;
	}
	public void describe() {
		System.out.println("teacherNum"+TeacherNum+ "  " +"name="+name);
	}
}
