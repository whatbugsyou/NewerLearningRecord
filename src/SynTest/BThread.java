package SynTest;

public class BThread implements Runnable{
	SynFunc sF;
	
	public BThread(SynFunc sF) {
		super();
		this.sF = sF;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		sF.c();
		sF.b();
	}

}
