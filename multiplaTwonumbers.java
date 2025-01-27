import java.util.Scanner;

public class multiplaTwonumbers {

    public static int multiTwonum(int a, int b) {
        int mult = a * b;
        return mult;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your first and second number");
        int a= sc.nextInt();
        int b = sc.nextInt();

        int mult = a* b;
        System.out.println(mult);
    }
}
