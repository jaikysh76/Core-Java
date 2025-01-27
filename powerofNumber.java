import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class powerofNumber {
    public static void main (String[] args) {
        System.out.println("Enter your no x --> base \t y --> power");
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int y= sc.nextInt();

      long  result = power(x, y);
        System.out.println(power(x,y));


    }
    public static long power (int x, int y) {
        long result =1 ;
        for (int i = 0; i < y; i++) {
            result *= x;
        }

        return result;
    }

}
