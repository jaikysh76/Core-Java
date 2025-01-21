import java.util.*;

public class labProgram_2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter A and  B");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Enter your Activity" + "1 --> Addition \t 2 --> Subst \t 3 --> Mult \t 4 --> Divide \t 5 --> modulus" );
            int operator = sc.nextInt();
            /**
             * 1 -> +
             * 2 -> -
             * 3 -> *
             * 4 -> /
             * 5 -> %
             */

            switch(operator) {
                case 1 : System.out.println(a+b);
                    break;
                case 2 : System.out.println(a-b);
                    break;
                case 3 : System.out.println(a*b);
                    break;
                case 4 : if(b == 0) {
                    System.out.println("Invalid Division");
                } else {
                    System.out.println(a/b);
                }
                    break;
                case 5 : if(b == 0) {
                    System.out.println("Invalid Division");
                } else {
                    System.out.println(a%b);
                }
                    break;
                default : System.out.println("Invalid Operator");
            }
        }
}

