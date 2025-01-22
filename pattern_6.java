import java.util.Scanner;

public class pattern_6 {
    public static void main(String [] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your pattern limit");
        int input = sc.nextInt();

        /*Outer loop started */
        for ( int i = 1; i <= input; i++ ) {
            /*Inner loop started */
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }System.out.println();
        }
    }
}
