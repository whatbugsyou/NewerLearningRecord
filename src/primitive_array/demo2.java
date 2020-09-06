package primitive_array;

/**
 *
 * @author Hzl
 * 1⃣️pakage 用途--->文件夹
 * 2⃣️数组长度 .length 
 * 3⃣️提示输入 alt+/
 *
 */

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age1=10;
		int age2=20;
		int age3=30;
		int age4=40;
		
		String name1="张1";
		String name2="张2";
		String name3="张3";
		String name4="张4";
		
		int[] ages=new int[4];
		String[] names=new String[4];
		
		ages[0]=age1;
		ages[1]=age2;
		ages[2]=age3;
		ages[3]=age4;
		
		names[0]=name1;
		names[1]=name2;
		names[2]=name3;
		names[3]=name4;
		
		for(int i=0;i<ages.length;i++) {
			System.out.println(ages[i]);
		}
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
				
		
	}

}
