package string;

public class Work2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = new String("23.txt,asda.java,新建.docx");
		System.out.println("字符串：" + string);
		String[] s = string.split(",");
		String a=new String(s[0]);
		String[] s_2=a.split("\\.");
		System.out.println(a);
		System.out.println(s_2[0]);
		for (String string2 : s) {
			
//			String[] split_2 = string2.split(".");

		}

	}

}
