import java.util.Scanner;

public class voting_Rule {
    public static void main(String [] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Age of Person");
        int age = sc.nextInt();
        eligibility(age);    }
    public static void eligibility(int age) {
        if(age > 18) {
            System.out.println("you are Eligible for vote");
        }else {
            System.out.println("you are not Eligible for vote");
        }
    }
}
