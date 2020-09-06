package collection.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Work2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrayList = new ArrayList();
		User user = new User("name1", "123", "123", 1);
		User user2 = new User("name2", "345", "345", 1);
		User user3 = new User("name3", "567", "567", 1);
		User user4 = new User("name4", "789", "789", 1);
		arrayList.add(user);
		arrayList.add(user2);
		arrayList.add(user3);
		arrayList.add(user4);
		logIn(arrayList);
		register(arrayList);

	}

	static void register(ArrayList<User> arrayList) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("[进行注册]请依次输入姓名、账号、密码、年龄");
		String name =new String();
		String account =new String();
		String passWord =new String();
		int age =0;
		w:while(true) {
			name = scanner.next();
			account = scanner.next();
			passWord = scanner.next();
			age = scanner.nextInt();
			for (int i = 0; i < User.getUserNum(); i++) {
				User u = (User) arrayList.get(i);
				if(u.getAccount().equals(account)) {
					System.out.println("用户已存在请重新输入");continue w;
				}else {
					break w;
				}
			}
		}
		arrayList.add(new User(name, account, passWord, age));
		System.out.println("注册成功");
		scanner.close();
	}

	static void logIn(ArrayList<User> arrayList) {
		Scanner scanner = new Scanner(System.in);
		w: while (true) {
			System.out.println("请输入账号：");
			String ac = scanner.next();
			System.out.println("请输入密码");
			String pw = scanner.next();
			for (int i = 0; i < User.getUserNum(); i++) {
				User u = (User) arrayList.get(i);
				if (u.getAccount().equals(ac) && u.getPassword().equals(pw)) {
					System.out.println("登陆成功");
					break w;
				}
			}
			System.err.println("登陆失败，请重新输入");// 不换行？？
			System.out.println("");
		}
	}
}
