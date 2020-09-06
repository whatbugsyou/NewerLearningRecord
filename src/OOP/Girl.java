package OOP;
/**
 * 此类 Pet 为接口,说明接口可以是成员变量。初始化需要用一个实现此接口的类的对象。
 * 若是一个成员变量需要满足多个接口的实现，可以定义一个新接口多继承(extends)所有接口(逗号隔开)。
 * 接口只能 *继承* *接口*
 * 
 * @author Hzl
 *
 */
public class Girl {
	Pet a;

	public void palyWithPet() {
		a.playWithOwner();
	}

	public Girl(Pet a) {
		super();
		this.a = a;
	}

	public static void main(String[] args) {
		Pet pet = new Dog();// 类似向上转型
		Girl girl = new Girl(pet);
		pet = new Cat();
		girl.palyWithPet();
	}
}
