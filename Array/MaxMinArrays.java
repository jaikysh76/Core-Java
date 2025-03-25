package Array;

public class MaxMinArrays {
    public static void main(String[] args) {
        int [] arr = {1,4,8,9,10,4};
        int max  = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int num:arr){
            min= Math.min(min,num);
            max= Math.max(max,num);

        }
        System.out.println("Min: " + min + ", Max: " + max);

    }
}
