import java.util.Scanner;

public class pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your row limit");
        int row = sc.nextInt();
        System.out.println("Enter your Columns Limit ");
        int columns= sc.nextInt();
        // outer loop
        for ( int i = 1; i <= row; i++) {
            // inner loop
            for (int j = 1; j <= columns; j++)
            {
                if( i == 1 || i == row|| j==1 || j == columns) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
