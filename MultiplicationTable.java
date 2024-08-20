package Project;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        multiplicationtable();
    }
    public static void multiplicationtable(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Input a number: ");
        int n= sc.nextInt();
        System.out.println("The multiplication table is: ");
        for(int i=0; i<=10; i++){
            System.out.println(n+" * "+i+" = " + n*i);
        }
    }
}
