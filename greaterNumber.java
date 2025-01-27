import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class greaterNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your numbers A \t B");
        int a = sc.nextInt();
        int b= sc.nextInt();
        greaterBetweenBoth(a,b);

    }
    public static void greaterBetweenBoth(int a, int b) {
        int c;
        if(a>b){
            System.out.println(" A is greater then B");
        } else if(b>a) {
            System.out.println("B is greater then A");
        }else {
            System.out.println("Happy Coding");
        }
    }
}
