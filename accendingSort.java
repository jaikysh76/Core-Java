import java.util.Scanner;

public class accendingSort {
    public static void main (String [] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your No's ");
        int input = sc.nextInt();
        int assending [] = new int[input];

        for(int i=0; i<input; i++) {
            assending [i] =sc.nextInt();
        }
        boolean isAscending =true;

        for(int i=0; i< assending.length -1;i++) {
            if(assending[i] > assending[i+1]) {
                isAscending = false;
            }
        }
        if(isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }

    }
}
