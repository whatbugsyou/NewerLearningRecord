package singleton;

public class SingleIn {
	private SingleIn() {
		// TODO Auto-generated constructor stub
	}

	private static SingleIn t = null;

	public static SingleIn getInstance() {
		
		if (t == null) {
			t = new SingleIn();
			t.show();
		}
		return t;
	}
	public void show() {
		System.out.println("...."+t);
	}

}
