package OOP;

public class Snake extends Animal implements Pet {

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("sssss");
	}

	@Override
	public void playWithOwner() {
		// TODO Auto-generated method stub
		System.out.println("蟒蛇和主人玩");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("自己玩");
	}
}
