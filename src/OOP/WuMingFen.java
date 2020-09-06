package OOP;

public class WuMingFen {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WuMingFen wuMingFen = new WuMingFen();
		WuMingFen wuMingFen2 = new WuMingFen("牛肉",10);
		WuMingFen wuMingFen3 = new WuMingFen("牛肉",2,true);
		wuMingFen.check();
		wuMingFen2.check();
		wuMingFen3.check();
	}
	private boolean likeSoup;//汤
	private int quantity;//两
	private String thema;//码
	public int getQuantity() {
		return quantity;
	}
	public String getThema() {
		return thema;
	}
	public boolean isLikeSoup() {
		return likeSoup;
	}
	public void setLikeSoup(boolean likeSoup) {
		this.likeSoup = likeSoup;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setThema(String thema) {
		this.thema = thema;
	}
	
	public WuMingFen() {
		
	}
	public WuMingFen(String thema,int quantity) {
		this.thema=thema;
		this.quantity=quantity;
	}
	public WuMingFen(String thema,int quantity,boolean likeSoup) {
		this(thema,quantity);
		this.likeSoup=likeSoup;
	}
	public void check() {
		System.out.println(thema+"  "+quantity+"  "+"    "+likeSoup);
	}

}
