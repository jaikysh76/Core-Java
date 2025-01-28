import java.util.Scanner;

public class UserInputScreen {
    public static void main(String [] args ) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number ");
        int input= sc.nextInt();
        int userInput[]= new int[input];
        for(int i=0; i< input; i++) {
            userInput[i] =sc.nextInt();
        }
        for(int i=0;i<userInput.length; i++) {
            System.out.println("userInput " + (i+1) +" is : " + userInput[i]);

        }
    }
}
