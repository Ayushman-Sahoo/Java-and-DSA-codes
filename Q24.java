package Project;
import java.util.*;
public class Q24 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input the number: ");
        int num= sc.nextInt();
        int sum= oddsum(num);
        System.out.println("Odd sum till: " + num + " is " + sum );
    }
    public static int oddsum(int num) {
        int sum= 0;
        int i=1;
        while (i <= num) {
            sum+=i;
            i+=2;
        }
        return sum;
    }
}
