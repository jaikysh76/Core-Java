import java.util.Scanner;

public class pattern_3 {
    public static void main(String [] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Rows");
        int rows = sc.nextInt();
        /*Outer loop*/
        for ( int i = 1 ; i <= rows; i++){
            /*Inner Loop*/
            for (int j =1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
