import java.util.Scanner;

public class pattern_1 {
    public static void main(String[] args) {
        //outer loop
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your row and columns ");
        int row = sc.nextInt();
        int columns= sc.nextInt();
        for ( int i = 1; i <= row; i++) {
            //inner loop
            for ( int j = 1; j <= columns; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
