package fanxing;
/**
 * 泛型数组的创建  完善
 */
import java.lang.reflect.*; 
public class GenericArrayWithType<T> {

    private T[] array;
    @SuppressWarnings("unchecked")
    public GenericArrayWithType(Class<T> type, int sz) {
        array = (T[]) Array.newInstance(type, sz);//通过反射在运行时构出实际类型为type[]的对象数组，避免了类型擦除，从而转换成功，无ClassCastException
    }
    public void put(int index, T item){
        array[index] = item;
    }
    public T get(int index) { return array[index]; }
    public T[] rep() { return array; }  //能成功返回了~
    public static void main(String[] args) {
        GenericArrayWithType<Integer> gawtt = new GenericArrayWithType<>(Integer.class, 10);
        Integer[] ia = gawtt.rep(); //能成功返回了！
    }
}
