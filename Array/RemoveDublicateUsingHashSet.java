package Array;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Set;

public class RemoveDublicateUsingHashSet {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> set = new HashSet<>(list);
        List<Integer> uniqueList = new ArrayList<>(set);

        System.out.println(uniqueList);

      //  Using Streams (Preserves Order, O(N))

     //   java
        //   List<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList());

    }
}
