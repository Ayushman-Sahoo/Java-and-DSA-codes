package Project;
import java.util.*;
public class Q14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the temperature in farhenite: ");
        float temp= sc.nextFloat();
        float celsius= (temp-32)*5/9;
        System.out.println("Temperature in celsius: " + celsius);
    }
}
