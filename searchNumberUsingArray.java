import java.util.Scanner;

public class searchNumberUsingArray {
    public static void main(String [] args ) {
        Scanner sc= new Scanner(System.in);
        int input = sc.nextInt();
        int userInput[]=new int[input]; //

        for (int i=0; i< input; i++) {
            userInput [i] = sc.nextInt();
        }
        //outer
         int matchNumber= sc.nextInt(); //store user input
        for ( int i=0; i<userInput.length; i++) {
            if (userInput[i] == matchNumber) {
                System.out.println("X index " +i);
            }
        }


    }
}
