import java.util.Scanner;

public class pattren_4 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pattern ");
        int input = sc.nextInt();
        //outer loop

        for(int i =input; i>=1; i--)
        {
            /*inner loop*/
            for( int j =0 ; j<= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
