package Project;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str= sc.nextLine();
        System.out.println("Your String is "+ ((isapalindrome(str)?"Palindrome":"Not Palindrome")));
    }
    public static boolean isapalindrome(String str){
        if (str.length()<=1) {
            return true;
        }
        int lastPos= str.length()-1;
        if (str.charAt(0)!=str.charAt(lastPos)) {
            return false;
        }
        String newStr= str.substring(1, lastPos);
        return isapalindrome(newStr);
    }
}
