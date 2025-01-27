import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class userInputTwoNumberSum {

    public static int userInput(int a, int b) {
       int  sum= a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your first  and \t second number ");
        int a= sc.nextInt();
        int b =sc.nextInt();
        int sum =userInput(a,b);
        System.out.println(sum);

    }
}
