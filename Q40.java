package Project;
import java.util.*;
public class Q40 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int rows= sc.nextInt();
        printreverseRighthalf(rows);
    }
    public static void printreverseRighthalf(int maxRows){
        int rows= maxRows; 
        while(rows>0){
            int i= 0;
            while(i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
}