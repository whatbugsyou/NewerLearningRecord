package OOP;
/**
 *  
 *  1⃣️封装：1.安全性 2.使用方便 3.重复使用 4.变化隔离
 *  
 *  2⃣️修饰符作用域-----------------------------------
 * 			 private  		默认  		protected	  public
 * 	可见性	 同类    		同包  		同包或子类      项目
 *  可修饰    属性，方法		属性，方法	属性，方法      属性，方法，类
 *  3⃣️ protected-----------------------------------
 *  对于protected,包外不能直接用对象.属性。
 *  如果不写set,那么值将不能被直接修改,只能调用其他函数间接修改。
 *  比如计算圆面积，通过修改半径，而间接修改面积，不能直接给面积赋值。相当于被保护（protected）
 * @author Hzl

 */
public class Employee {

	private int age;
	private String gender;
	private String name;

	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getName() {
		return name;
	}


	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		if (gender.equals("男")||gender.equals("女")) {
			this.gender = gender;
		}else {
			System.out.println("性别输入错误");
		}
	}
	public void setName(String name) {
		this.name = name;
	}
	public void work(String content) {
		System.out.println("工作内容:" + content);
	}
}
