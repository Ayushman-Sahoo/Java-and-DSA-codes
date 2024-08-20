package Project;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the operation: ");
        String operation= sc.next();
        double result= switch(operation){
            case "add" -> num1+num2;
            case "subtract" -> num1-num2;
            case "multiply" -> num1*num2;
            case "division" -> num1/num2;
            case "modulus" -> num1%num2;
            default -> -1;
        };
        System.out.println("Result: "+result);
    }
}
