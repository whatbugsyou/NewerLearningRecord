package stringBuffer;
/**
 * 模仿StringBuffer 底层char[]
 */
import java.util.Arrays;

public class MyBuffer {
	private char[] value;
	private int capacity;
	private int count;

	public char[] getValue() {
		return value;
	}

	public void setValue(char[] value) {
		this.value = value;
	}

	public int getCapacity() {
		return capacity;
	}

	

	public int getCount() {
		return count;
	}

	public int length() {
		return count;
	}

	public MyBuffer() {
		this(4);
	}

	public MyBuffer(int c) {
		value = new char[c];
		this.capacity = c;
		this.count = 0;
	}

	public MyBuffer(String str) {
		this(str.length());
		capacity = value.length;
		add(str);
	}

	public MyBuffer add(String str) {
		int newCapacity = str.length() + this.count;
		ensureCapacity(newCapacity);
		System.arraycopy(str.toCharArray(), 0, value, count, str.length());
		count = str.length() + count;
		return this;
	}

	// 在第index个字符后面插入c
	public MyBuffer insert(int index, char c) {
		if (index > count||index <1) {
			System.err.println("超过String长度" + count + "无法插入");
			return this;
		}
		int newCapacity = count + 1;
		ensureCapacity(newCapacity);
		index--;// 物理序号
		for (int i = count; i > index; i--) {
			value[i] = value[i - 1];
		}
		value[index] = c;
		count++;
		return this;
	}
	public MyBuffer insert(int index,String s) {
		int len=s.length();
		for (int i = 0; i < len; i++) {
			insert(index+i, s.charAt(i));
		}
		return this;
	}

	// 实时扩容，不多不少
	public void ensureCapacity(int newCapacity) {
		// if (newCapacity > this.count) {
		value = Arrays.copyOf(value, newCapacity);// 扩容，以新的长度，后面添加空字符
		// }
	}

	public static void main(String[] args) {
		MyBuffer myBuffer = new MyBuffer("123456");
		myBuffer.insert(3, 'c');
		myBuffer.insert(1, "字符串");
		System.out.println(Arrays.toString(myBuffer.getValue()));
	}

}
