import java.util.Scanner;

public class userMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int numbers [] [] = new int [rows][columns];
        for(int i=0;i<rows; i++){
            for(int j=0; j<columns; j++) {
                numbers[i] [j] = sc.nextInt();
            }
        }
        int input= sc.nextInt();
        for ( int i =0 ; i < rows; i++) {
            for (int j= 0 ; j< columns; j++) {
                if(numbers [i] [j] == input){
                    System.out.println("location find at  " +i+ " "+j);
                }
            }
        }
    }
}
