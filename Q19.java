package Project;
import java.util.*;
public class Q19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input First number: ");
        float a= sc.nextInt();
        System.out.println("Enter Second number: ");
        float b= sc.nextFloat();
        System.out.println("Enter third number: ");
        float c= sc.nextFloat();
        if(a>=b && a>=c){
            System.out.println("Largest number is: " + a);
        } 
        else if(b>=c){
            System.out.println("Largest nunber is: "+ b);
        }
        else{
            System.out.println("Largest number is: " + c);
        }
    }
}
