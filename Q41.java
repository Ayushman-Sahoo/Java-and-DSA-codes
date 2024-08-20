package Project;
import java.util.*;
public class Q41 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int rows= sc.nextInt();
        lefthalfpyramid(rows);
    }
    public static void lefthalfpyramid(int maxRows){
        int rows= maxRows; 
        while(rows>0){
            //this loops prints spaces
            int j=0;
            while (j<rows-1) {
                System.out.print(" ");
                j++;
            }
            //this loops prints stars 
            int i= 0;
            while(i<(maxRows-rows)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
}