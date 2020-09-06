package OOP2;
/**
 * 
 * @author Hzl
 *
 */
public class Cat extends Animal {
	private int tailLength;
	public void catchMouse() {
		System.out.println("抓老鼠");
		super.age=0;
	}
	public int getTailLength() {
		return tailLength;
	}
	public void setTailLength(int tailLength) {
		this.tailLength = tailLength;
	}
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.age=1;
	}
}
