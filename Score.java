package Project;
import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();
        String number= num>80? "High" : (num>50? "moderate":"Low");
        System.out.println("Your score is "+ number);
    }
}
