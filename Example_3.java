import java.util.Arrays;

public class Example_3 {
    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list.get(1)); // Output: 2
    }

}
class CustomArrayList<T> {
    private Object[] array;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public CustomArrayList() {
        array = new Object[DEFAULT_CAPACITY];
    }

    public void add(T element) {
        if (size == array.length) {
            resize();
        }
        array[size++] = element;
    }

    private void resize() {
        array = Arrays.copyOf(array, array.length * 2);
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index >= size) throw new IndexOutOfBoundsException();
        return (T) array[index];
    }

    public int size() {
        return size;
    }
}
