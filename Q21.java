package Project;
import java.util.*;
public class Q21 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a= sc.nextInt();
        System.out.print("Enter the second number: ");
        int b= sc.nextInt();
        int result= a&b;
        int bas= a|b;
        int sex= a^b;
        int sam= ~b;
        int suam= ~a;
        int swarm= a<<6;
        int swam= b<<5;
        int qwer= a>>6;
        int asd= b>>5;
        System.out.println(result); 
        System.out.println(bas);
        System.out.println(sex);
        System.out.println(sam);
        System.out.println(suam);
        System.out.println(swarm);
        System.out.println(swam);
        System.out.println(qwer);
        System.out.println(asd);
    }
}
