import java.util.Scanner;

public class averageOfNumbers {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A \t B \t C");
        int a =  sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println("your no avg is : \t " +avgNumber(a, b,c));
    }
    public static int avgNumber(int a, int b, int c) {
        int avg = (a+b+c)/3;
        return avg;
    }
}
