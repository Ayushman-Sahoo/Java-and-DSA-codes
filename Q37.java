package Project;
import java.util.*;
public class Q37 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        boolean isArmstrong= isArmstrong(n);
        if(isArmstrong){
            System.out.println("Your number is Armstrong.");
        }
        else{
            System.out.println("Number is not armstrong number.");
        }
    }
    public static boolean isArmstrong(int n) {
        int noofDigits= noofDigits(n);
        int ncopy=n;
        int finalNumber=0;
        while (n>0) {
            int lastdigits= n%10;
            n/=10;
            finalNumber+=pow(lastdigits, noofDigits);
        }
        return finalNumber== ncopy; 

    }

public static int pow(int num1, int num2){
    int result=1;
    int i= 0;
    while (i<num2) {
        result*=num1;
        i++;
    }
    return result;
}
    public static int noofDigits(int n) {
        int digits=0;
        while (n>0) {
            digits++;
            n/=10;
        }
        return digits;
    }
}