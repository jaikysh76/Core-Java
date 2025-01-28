import java.util.Scanner;

public class studentDetailsUsingArray {
    public static void main(String[] args) {
       /* int[] marks= new int [3];
        marks[0]= 90;
        marks[1]= 96;
        marks[2]= 94;*/
      /*  int marks[]={95,96,97};*/
        Scanner sc= new Scanner(System.in);
        System.out.println("No of Subject");
        int size =sc.nextInt();
        System.out.println("Enter your marks");
        int marks [] = new int [size];



       /* System.out.println("English : \t"  +marks[0]);
        System.out.println("Math : \t" +marks[1]);
        System.out.println("Chem : \t" +marks[2]);
*/   //for input
        for ( int i=0 ; i<size; i++) {
            marks[i] = sc.nextInt();
        }
//for output
        for ( int i=0 ;i < size;i++) {
            System.out.println(marks[i]);
        }

    }
}
