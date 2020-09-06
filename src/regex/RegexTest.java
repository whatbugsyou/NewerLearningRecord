package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式匹配字符串 
 * . 一个字符 
 * []其中一个 [a-zA-Z] 
 * | 或者 
 * ^反向  [a-z&&[^az]] 小写字母除了az
 * 
 * ？0或1个 ?紧随任何其他限定符（*、+、?、{n}、{n,}、{n,m}）之后时,匹配模式是"非贪心的".
 * 例如，在字符串"oooo"中，"o+?"只匹配单个"o"，而"o+"匹配所有"o"。
 *  * 0或多个 
 *  + 1或多个 
 *  {n,m}: 
 *  	{n} n个 
 * 		{n,}至少n个 
 * 		{n,m} n-m个 
 * \d \D 数字非数字 
 * \w \W 字类字符和非 
 * \s 空格 \b 边界(包括标点符号)
 * \1\2 与括号连用 \1表示重复第一个括号里的内容
 * 
 * @author Hzl
 *
 */
public class RegexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 匹配手机号码(直接)
		String num = "13100252577";
		boolean matches = num.matches("1[2538][0-9]{9}");
		System.out.println("电话号码匹配（matchers）"+matches);

		// (用类)
		/**
		 * 1先编译成Pattern,只能用静态方法
		 * private new Pattern(String p, int f)  私有
		 * 2再装进工具，只能用Pattern对象间接调用Matcher构造函数获得Matcher对象
		 * new Matcher();  作用域：默认---包  Pattern和Matcher都在java.util.regex包
		 * 3由Matcher对象操作字符串
		 * 
		 */
		Pattern pat = Pattern.compile("1[2538][0-9]{9}()()()()");
		Matcher matcher = pat.matcher(num);
	
		System.out.println("电话号码匹配（matcher）"+matcher.matches());//完全区域匹配,意味着整个字符串都要符合模式。
		//		matcher.lookingAt();从第一个字符开始匹配，但是不至于整个区域匹配。（以什么开头）
		//		String result = matcher.replaceAll("Everythingwanted"); 匹配替换，类似的replaceFirst
		//		matcher.find(); 寻找下一次匹配。结合while循环
		//      matcher.appendReplacement(buf, "a"); 结合find，将匹配的内容替换成a，从上一次匹配结束处到这一次匹配结束处的内容追加到buf后。
		//		matcher.appendTail(buf);考虑到find完毕之后，还有一段字符从上次匹配结束到末尾，则会遗漏了添加到buf中。
		System.out.println(matcher.groupCount());
		System.out.println("匹配到的组0"+matcher.group(0));//用括号分组
		//		
		//
		String mail = "786878@qq.com";
		boolean matches2 = mail.matches("[1-9][0-9]{5,}@qq\\.com");
		System.out.println(matches2);
		System.out.println("------------------------");
		findTest();

	}

	private static void findTest() {
		String REGEX = "\\bcat\\b";
		String INPUT = "cat cat cat cattie cat";

		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT); // 获取 matcher 对象
		int count = 0;

		while (m.find()) {
			count++;
			System.out.println("Match number " + count);
			System.out.println("start(): " + m.start());
			System.out.println("end(): " + m.end());
		}
	}

}
