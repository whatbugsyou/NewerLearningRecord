package OOP;

public class Dog extends Animal implements Pet {
	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("汪汪汪");
	}

	@Override
	public void playWithOwner() {
		// TODO Auto-generated method stub
		System.out.println(" 狗狗和主人玩");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("自己玩");
	}
}
