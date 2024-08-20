package Project;
import java.util.*;
public class Q36 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        System.out.print("Here is the fibonacci series: ");
        printFibonacci(num);
    }
    public static void printFibonacci(int num) {
        if(num<0) return;
        System.out.print("0 ");
        if(num==0)return;
        System.out.print("1 ");

        int first=0, second=1;
        while (first+second<=num) {
            int third= first+second;
            System.out.print(third+" ");
            first= second;
            second=third;
        }
    }
}