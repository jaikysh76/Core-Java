import java.util.Scanner;

public class oddNumbers {
    public static void main(String [] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Numbers");
        int input = sc.nextInt();
        oddNum(input);

    }
    public static void oddNum( int input) {
        if (input % 2 != 0 ) {
            System.out.println("odd Number");
        }
        else if(input != 0) {
            System.out.println("invalid number");
        }
        else {
            System.out.println("Not odd numbers");
        }
    }
}
