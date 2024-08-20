package Project;
import java.util.*;
public class Q7 {
    //interchanging of numbers
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= 12;
        System.out.println("The value of a is: "+a);
        int b= 10;
        System.out.println("the value of b is: " + b);
        int z= a; 
        a=b;
        b=z;
        System.out.println("The vale of a after interchange is: " + a);
        System.out.println("The vale of b after interchange is: " + b);
    }
}
