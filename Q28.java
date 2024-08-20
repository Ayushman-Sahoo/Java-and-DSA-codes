package Project;
import java.util.*;
public class Q28 {
//GCD of the number
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter first number: ");
        int m= sc.nextInt();
        System.out.println("enter second number: ");
        int n= sc.nextInt();
        int gcd= gcd(m, n);
        System.out.println("GCD of the numbers is: " +gcd);
    }
    public static int gcd(int m, int n){
        int gcd= 1;
        int i= 2;
        int least= least(m, n);
        while(i<least){
            if(m%i==0 && n%i==0){
                gcd=i;
            }
            i++;
        }
        return gcd;
    }
    public static int least (int num1, int num2){
        if(num1<num2){
            return num1;
        }
        else{
            return num2;
        }
    }
}