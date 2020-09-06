package Exam_2;
/*
  判断参数 n 是否为质数，若是质数则返回 true，否则返回 false
（质数：只能被1和它自身整除的数）
 */
public class MathUtil {
	public static boolean isPrime(int n) {
		int sup =(int) Math.sqrt(n);
		for(int i = 2;i<=sup;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
