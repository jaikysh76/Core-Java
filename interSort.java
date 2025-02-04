import java.util.Scanner;

public class interSort {
    public static void isNumber(int input []) {
        for (int i= 0; i< input.length; i++){
            System.out.println(input[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size ");
        int size = sc.nextInt();
        int input [] = new int [size];

        for(int i=0 ; i<size; i++) {
            input [i] = sc.nextInt();
        }

        for ( int i =0 ; i<input.length -1; i++) {
            for(int j=0; j<input.length -i -1; j++) {
                if(input[j]>input[j+1]) {
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
        isNumber(input);
    }
}
// time complexity O(n^2)