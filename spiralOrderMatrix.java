import java.util.Scanner;

public class spiralOrderMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your rows \t columns");
        int rows= sc.nextInt();
        int columns= sc.nextInt();
        int input [] [] = new int [rows] [columns];
         //input from user
        for(int i =0; i< rows; i++) {
            for(int j=0 ; j< columns; j++) {
                input [i] [j] = sc.nextInt();
            }
        }
        int rowStart = 0;
        int rowEnd = rows-1;
        int colStart = 0;
        int colEnd = columns-1;


        //To print spiral order matrix
        while(rowStart <= rowEnd && colStart <= colEnd) {
            //1
            for(int col=colStart; col<=colEnd; col++) {
                System.out.print(input[rowStart][col] + " ");
            }
            rowStart++;


            //2
            for(int row=rowStart; row<=rowEnd; row++) {
                System.out.print(input[row][colEnd] +" ");
            }
            colEnd--;


            //3
            for(int col=colEnd; col>=colStart; col--) {
                System.out.print(input[rowEnd][col] + " ");
            }
            rowEnd--;


            //4
            for(int row=rowEnd; row>=rowStart; row--) {
                System.out.print(input[row][colStart] + " ");
            }
            colStart++;


            System.out.println();
        }


    }
}
