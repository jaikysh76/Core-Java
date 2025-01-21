import java.util.Scanner;

public class pattern_5 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Number");
        int input = sc.nextInt();
        /*Outer loop*/
        for(int i = 1 ; i <= input; i++ ) {
            /*Inner loop*/
            for(int j= 1; j <= input - i ; j++) {/*for space*/
                System.out.print(" ");
            }
            /*inner loop*/
            for(int k =1 ; k <= i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
