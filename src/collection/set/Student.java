package collection.set;

public class Student implements Comparable<Student>{
	private int score;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		return this.getScore()-o.getScore();
	}
	public Student(int score) {
		super();
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	@Override
	public String toString() {
		return "Student [score=" + score + "]";
	}
	public void setScore(int score) {
		this.score = score;
	}

	
}
