package Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {15 , 16 , 17 ,18 };

        int left =0;
        int right= arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
