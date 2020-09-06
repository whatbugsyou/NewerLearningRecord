package string;

public class Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = new String("阿是跨境电商的.txt,asda.java,新建.docx");
		System.out.println("字符串："+string);
		String[] s=string.split(",");
		findJava(s);
		wjm(s);
		
	}
	public static void findJava(String[] string){
		System.out.println("其中的java文件有：");
		for (String string2 : string) {
			if(string2.endsWith(".java")) {
				System.out.println(string2);
			}
		}
	}
	public static void wjm(String[] string) {
		System.out.println("包含文件：");
		for (String s:string) {
			int index = s.lastIndexOf(".");
			s = s.substring(0, index);
			System.out.println("文件名：" + s);
		}
	}
}
