package Array;

import java.util.ArrayList;

public class Example_2 {
    public static void main(String[] args) {
        // craete a ArrayList

        ArrayList<Integer> a= new ArrayList<>();  //uses Integer instead of Int (Autoboxing)
       a.add(6);
       a.add(7);
        int num = a.get(0); //// Integer → int (unboxing)
        System.out.println(num);


        // adding
    }
}
