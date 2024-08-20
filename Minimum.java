package Project;
import java.util.*;
public class Minimum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int n= sc.nextInt();
        System.out.print("Please enter your second number: ");
        int m= sc.nextInt();
        Minimum Ternary= new Minimum();
        int Minimum= Ternary.Minimum(n,m);
        System.out.println("Minimum number is: "+ Minimum); 
    }
    public int Minimum(int n, int m){
        return (n<m)?n:m;
    }
}