package Project;
import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter 4 sides in cm: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d= sc.nextInt();
        int perimeter= a+b+c+d;
        System.out.println("Perimeter is: " + perimeter);
    }
}
