package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConverArrays {
    public static void main(String[] args) {
        //convert into ArrayList

        Integer arr [] = {15,16,17};
        List<Integer> list= new ArrayList<>(Arrays.asList(arr));

        System.out.println(arr[2]);


// Convert ArrayList to array
        Integer[] newArr = list.toArray(new Integer[0]);

    }
}
