package Project;
import java.util.*;
public class Q26 {
    //sum of Digits
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = sc.nextInt();
        int sum= sumofDigits(n);
        System.out.println("The sum of the digit: " + sum);
    }
    public static int sumofDigits(int n){
        int sum= 0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
