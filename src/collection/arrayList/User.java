package collection.arrayList;

public class User {
	private int ID;
	private String name;
	private String account;
	private String password;
	private int age;
	private static int userNum=0;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(String name, String account, String password, int age) {
		super();
		userNum++;
		ID=userNum;
		this.name = name;
		this.account = account;
		this.password = password;
		this.age = age;
	}
	public static int getUserNum() {
		return userNum;
	}

}
