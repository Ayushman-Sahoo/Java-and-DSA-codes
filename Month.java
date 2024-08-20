package Project;
import java.util.*;
public class Month {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your month number: ");
        int monthNum= sc.nextInt();
        String monthname= getMonthNmae(monthNum);
        System.out.println("Your Month name is: "+ monthname);
    }
    public static String getMonthNmae(int monthNum){
        return switch(monthNum){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month number";
        };
    }
}
