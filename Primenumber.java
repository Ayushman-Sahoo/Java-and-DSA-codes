package Project;
import java.util.*;
public class Primenumber {
//prime number
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*System.out.println("Enter the number: ");
        int n= sc.nextInt();
        boolean prime= prime(n);
        if(prime){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }*/

        System.out.print("Please enter the number: ");
        int number= sc.nextInt();
        System.out.println("Your number is "+ (isPrime(number)?"Prime":"not Prime"));
    }
    /*public static boolean prime(int n){
        int i=2;
        while (i<n) {
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }*/

    public static boolean isPrime(int number){
        for(int i=2; i<number; i++){
            if (number%i==0) {
                return false;                
            }
        }
        return true;
    }
}
