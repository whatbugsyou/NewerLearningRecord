package OOP;


/**
 * 1⃣️构造函数重载练习
 * @author Hzl
 *
 */
public class demo2 {
	public demo2(int a,int b) {
		System.out.print(a+"和"+b+"比较： ");
		if (a>b) {
			System.out.println("a大");
		}else if (a<b) {
			System.out.println("b大");
		}else{
			System.out.println("一样大");
		}
	}	
	public demo2(double a,double b,double c) {
		System.out.print(a+"*"+b+"*"+c+"=" );
		System.out.println(a*b*c);
	}
	public demo2(String a,String b) {
		if(a.equals(b)) {
			System.out.println(a+"和"+b+"两个字符串相同");
		}else {
			System.out.println(a+"和"+b+"两个字符串不同");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo2 d1 = new demo2(1,2);
		demo2 d2 = new demo2(1.0,2.0,3.0);
		demo2 d3 = new demo2("a","b");
	}

}
