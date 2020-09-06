package OOP;
/**
 * 构造方法知识
 * @author Hzl
 *1.方法和属性：public 对象和类都可以调用,private 对象不能调用（invisible）。
 *2.private 方法在定义类中的其他方法中可以调用,也不能在方法外用类名直接调用
 *3.static 变量为类变量，所有对象共享，公共属性
 *4.static 方法为类方法，在没有创建对象的时候也可以使用
 *5.static 修饰的东西用类名直接调用
 *6.static变量 第一次使用类的时候加载一次，整个程序结束销毁
 *7.static中不能调用非静态方法和属性，要先创建对象
 *6.总之，private的东西只能在类定义里用。static是类级别的东西
 *
 *方法重载（2同3不同，对于普通函数，返回值修改不能重载）
 *1.同一个类，同一个方法名
 *2.参数个数不同，参数类型不同，参数顺序不同 （？---如果类中4个参数都为同一个类型，分别给前两个，后两个，重载构造方法）
 *
 *synchronized修饰符
 *修饰方法：同一个对象里有多个synchronized方法，那么有线程访问其中一个方法时，其他的线程不能访问这些方法。不影响其他对象。
 *修饰类：防止多个线程同时访问这个类中的*静态方法*，对所有对象起作用，意味着不同线程里的同类对象，不能同时访问这个方法。
 *
 *volatile修饰符？？？
 *修饰变量，在每次改变的时候都会强制线程写回共享内存，线程访问强制重读。
 *
 *transient修饰符？？？
 */
public class Person {
	static int stacode=12312321;
	private int pricode=00000;
	String name;
	String sex;
	int age;
	double height;
	double weight;
	//默认构造函数。在程序员没写构造函数的时候内部自动生成。若程序员写了构造函数，则不自动生成默认构造函数
	//默认构造函数的域修饰符 同class
	public Person() {
		System.out.println("调用默认的构造方法");
	}
	public Person(int age,String sex) {
		this.age = age;
		this.sex = sex;
	}
	public Person(String name,String sex,int age,double height,double weight) {
		//1.在构造函数中调用别的构造函数，用this。用类名调用则表示普通函数
		//2.constractor must be the first statement in a constractor
		this(age,sex);
		this.name=name;
		this.weight=weight;
		this.height=height;
	}
	public void describe() {
		System.out.println(stacode+name+sex+age+height+weight);
		setPricode(1);
		prifunc();
	}
	private void prifunc() {
		System.out.println("private方法调用");
	}
	public static void stafunc() {
		System.out.println("static 方法调用");
	}
	public int getPricode() {
		return pricode;
	}
	public void setPricode(int pricode) {
		this.pricode = pricode;
	}

	
}
