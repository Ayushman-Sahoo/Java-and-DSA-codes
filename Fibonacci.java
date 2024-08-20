package Project;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements to be printed: ");
        int count= sc.nextInt();
        for(int i=1;i<=count;i++){
            System.out.println(fibbonaci(i)+ " ");
        }
    }
    public static int fibbonaci(int position){
        if (position==1) {
            return 0;
        }
        if (position==2) {
            return 1;
        }
        return fibbonaci(position-1)+fibbonaci(position-2);
    }
}
