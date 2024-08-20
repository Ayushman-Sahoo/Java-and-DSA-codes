package Project;
import java.util.*;
public class Q38 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number= sc.nextInt();
        boolean Palindrome= Palindrome(number);
        if(Palindrome){
            System.out.println("The number is a Palindrome.");
        }
        else{
            System.out.println("The number is not a Palindrome.");
        }
    }
    public static boolean Palindrome(int number){
        int reverse= reverse(number);
       return number==reverse; 
    }
    public static int reverse(int num) {
        int newnum= 0;
        while(num!=0){
            int rem= (num % 10);
            newnum= newnum*10+ rem;
            num= num/10;
        }
        return newnum;
    }
}