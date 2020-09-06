package OOP;

public class Cat extends Animal  implements Pet {

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("喵喵喵");
	}

	@Override
	public void playWithOwner() {
		// TODO Auto-generated method stub
		System.out.println("猫咪和主人玩");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("自己玩");
	}

}
