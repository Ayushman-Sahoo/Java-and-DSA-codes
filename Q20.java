package Project;
import java.util.*;
class Q20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year= sc.nextInt();
        if(year%400==0 || (year==4 && year!=100)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a leap year.");
        }
    }
}
