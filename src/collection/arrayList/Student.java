package collection.arrayList;

public class Student {

	private String name;
	private int age;
	private String gender;
	private int num;
	private int score;

	public Student(String name, int age, String gender, int num, int score) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.num = num;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
