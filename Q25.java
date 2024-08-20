package Project;
import java.util.*;
public class Q25 {
//Factorial of 2 number 
    /*public static long factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }*/

    public static long factorial(int n) {
        if (n == 0 || n==1) 
        {
            return 1;
        } 
        else 
        {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input the number: ");
        int n= sc.nextInt();
        long result = factorial(n);
        System.out.println("Factorial of " + n + " is " + result);
    }
}
