import java.util.Scanner;

public class pattern_7 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pattern limit");
        int number= sc.nextInt();

        /*outer loop*/
        for (int i =1; i <= number ; i++) {
            /*inner loop*/
           for(int j = 1 ; j <= number - i+1; j++) {
               System.out.print(j + " ");
           }
            System.out.println();
        }
    }
}
