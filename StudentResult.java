import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Input;

            /*Marks >=90 -> print “This is Good”
            89 >= Marks >= 60 -> print “This is also Good”
            59 >= Marks >= 0 -> print “This is Good as well”
            System.out.println("Enter your marks b/w 1 to 100");
            int num2 = sc.nextInt();

            if(num2>=90 && num2<=100)
                System.out.println("This is good");
            else if(num2>=60 && num2<90) {
               System.out.println("This is also good");
           }else if (num2>=0 && num2<60) {
                System.out.println("This is good as well");
            } else {
                System.out.println("Incorrect input");
            }
        } else {

            System.out.println("Please select b/w 1 or 0");
        }*/
        int marks;
            do{

                System.out.println("Choice the Number for Result \t 1 : Result \t 0 : NoResult");
                Input= sc.nextInt();

                if (Input == 1) {
                    System.out.println("Enter your marks");
                    marks=sc.nextInt();

                    if(marks>=90 && marks<=100)
                        System.out.println("This is good");
                    else if(marks>=60 && marks<90) {
                        System.out.println("This is also good");
                    }else if (marks>=0 && marks<60) {
                        System.out.println("This is good as well");
                    }
                    else if (Input !=0)
                    {
                        System.out.println("No Result");
                    }else {
                        System.out.println("Incorrect input");
                    }
                }else if(Input ==0)
                {
                    System.out.println("No Result");
                }
            }while(Input != 0);
    }
}
