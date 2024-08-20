package Project;
import java.util.*;
public class Q39 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows= sc.nextInt();
        int maxrows;
        printFirstPattern(rows);
    }
    public static void printFirstPattern(int maxrows){
        int rows= 0;
        while(rows<maxrows){
            System.out.print("*");
            int i=0;
            while(i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}