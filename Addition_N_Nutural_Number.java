import java.util.Scanner;

public class Addition_N_Nutural_Number {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no limit");
        int num =sc.nextInt();
        int num_1= 0;
        for(int i=1; i<= num; i++)
        {

            num_1= num_1+i;

        } System.out.println(num_1);

    }
}
