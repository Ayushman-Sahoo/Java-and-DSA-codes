package Project;
import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input first number: ");
        int a= sc.nextInt();
        System.out.println("Input Second number:");
        int b= sc.nextInt();
        int c= a+b;
        System.out.println("Sum of 2 numbers: " + c);
        int d= a-b;
        System.out.println("Substraction of 2 number: " + d);
        int e= a*b;
        System.out.println("Multiplication of 2 number:" + e);
        float f= a/b;
        System.out.println("Division of 2 numbers: " + f);
        float g= a%b; 
        System.out.println("Reminder of 2 numbers: " + g);
    }
}
