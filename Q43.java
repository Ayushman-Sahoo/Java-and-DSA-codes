package Project;
import java.util.Scanner;

public class Q43 {
  public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][]arr= {{1,2,3}, {4,5,6}, {7,8,9}};
        int i=0;
        while(i<arr.length){
          int j=0;
          while(j<arr[i].length){
            System.out.print(arr[i][j]+ " ");
            j++;
          }
          System.out.println();
          i++;
        }
    }   
}
