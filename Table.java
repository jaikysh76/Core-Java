import java.util.Scanner;

public class Table {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Table");
        int n= sc.nextInt();
        int table =1;

        for(int i=1; i<=10;i++)
        {
            System.out.println(n*i);
        }

    }
}
