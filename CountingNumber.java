import java.util.Scanner;

public class CountingNumber {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your Count limit");
        int number=sc.nextInt();


       /* for(int i=0;i<number;i++){
            System.out.println(i);
        }
        int i = 0;
        while(i<=number){
            System.out.println(i);
            i++;



    }*/ int i=0;
        do{

            System.out.println(i);
            i++;
        }while (i<=number);
    }
}
