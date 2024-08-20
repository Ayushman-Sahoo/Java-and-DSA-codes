package Project;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1= sc.nextInt();
        String number= num1%2==0?"Even":"Odd";
        System.out.println("The number is "+ number);
    }
}
