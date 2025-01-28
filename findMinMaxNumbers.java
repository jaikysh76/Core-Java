import java.util.Scanner;

public class findMinMaxNumbers {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no: ");
        int input = sc. nextInt();
        int numbers [] = new int [input];
        //user Input
        for(int i = 0; i<input; i++){
            numbers[i] = sc.nextInt();
        }
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for(int i = 0; i< numbers.length; i++) {
                if(numbers[i] < min) {
                    min = numbers[i];
                }
                if(numbers[i] > max) {
                    max = numbers[i];
                }

            }
        System.out.println(max);
        System.out.println(min);
    }
}
