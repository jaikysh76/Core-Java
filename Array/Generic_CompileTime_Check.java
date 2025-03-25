package Array;

import java.util.ArrayList;

public class Generic_CompileTime_Check {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // list.add("hello"); // Compilation error: incompatible type
        list.add(10);
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hello"); // Allowed
       // list1.add(10); // Compilation error: incompatible type

    }
}
