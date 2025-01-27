import java.util.Scanner;

public class circumferenceOfCircle {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius of Circle");
        int r= sc.nextInt();
        circumference(r);
    }

    public static void circumference( int r) {
        double circum ;
        circum= 2* 3.14*r;
        System.out.println(circum);
    }
}
