import javax.xml.transform.Source;
import java.util.Scanner;

public class printMyName {
    public static void printName( String name) {
        System.out.printf(name);
        return;
    }
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name");
        String name= sc.next();
        printName(name);
    }

}
