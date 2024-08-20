package Project;
import java.util.Scanner;

public class numbergusseing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= 5, guess;
        do{
            System.out.print("Please guess the number(0 - 10): ");
            guess= sc.nextInt();
        }while(num!=guess);
        System.out.println("You Have successfully gussed the number.");
    }
}
