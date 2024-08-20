package Project;
import java.util.Scanner;

public class Exit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (true) {
            System.out.print("Enter your command: ");
            String command= sc.next();
            if (command.equalsIgnoreCase("exit")) {
                break;
            }
        }
        System.out.println("You have successfully exited.");
    }
}
