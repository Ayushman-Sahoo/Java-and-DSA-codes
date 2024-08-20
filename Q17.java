package Project;
import java.util.*;
public class Q17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        if(n>0){
            System.out.println("the number is positive");
        }
        else if(n<0){
            System.out.println("the number is negeative");
        }
        else{
            System.out.println("the number is 0.");
        }
    }
}
