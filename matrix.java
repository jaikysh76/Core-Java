import java.util.Scanner;

public class matrix {
    public static void main(String [] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your matrix: \t no of row: \t no of columns");
        int row = sc.nextInt();
        int columns= sc.nextInt();

        int rowColum [] []= new int [row] [columns];
    //input
        for ( int i=0;i<row; i++) { // outer loop --> control i
            for (int j= 0; j< columns; j++) { // Inner loop --> control j
               rowColum [i] [j] =sc.nextInt(); // input liye h sc.next se and store krwa diye
            }
        }
        for (int i=0; i< row; i++) {
            for (int j=0 ; j< columns; j++) {
                System.out.print(rowColum [i] [j] + " ");
            }
            System.out.println();
        }
    }
}
