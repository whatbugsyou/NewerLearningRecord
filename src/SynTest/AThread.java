package SynTest;

public class AThread implements Runnable{
	SynFunc sF;
	
	public AThread(SynFunc sF) {
		super();
		this.sF = sF;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		sF.a();
	}

}
