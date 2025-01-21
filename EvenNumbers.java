import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Even Number Limit");
        int n = sc.nextInt();
        System.out.print("List of even numbers from 1 to "+n+": ");
        // for loop
       /* for(int i =1; i<=n ;i++)
        {

            if(i%2==0){
                System.out.println(i+" ");
            }
        }*/
        //While loop
        int i=2;
        while(i<=n)
        {
            if(i%2==0)
            {
                System.out.println(i+ "");
               i=i+2;
            }
        }
    }
}
