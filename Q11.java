package Project;
import java.util.*;
public class Q11 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the base: ");
      double base= sc.nextDouble();
      System.out.println("Enter the heigth: ");
      double height= sc.nextDouble();
      double area= (base*height)/2;
      System.out.println("The ara of the triangle is: "+ area);
    }
}
