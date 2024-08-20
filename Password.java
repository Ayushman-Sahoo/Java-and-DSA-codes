package Project;
import java.util.*;
public class Password {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String password;
        do{
            System.out.print("Enter the password: ");
            password = sc.nextLine();
        }while(!isValidPassword(password));
            System.out.println("Thanks for entering a valid password.");
    }
    public static boolean isValidPassword(String password){
        return password.length()>6;
    }
}
