package OOP;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person.stafunc();
		Person person1 = new Person();
		Person person2 = new Person(18,"男");
		Person person3 = new Person("name", "sex", 19, 180, 65);
		Person.stacode=12;
//		person3.prifunc;err
//		Person.pricode=13;err
		person1.describe();
		person2.describe();
		person3.describe();
	}

}
