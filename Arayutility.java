package Project;
import java.util.*;
 
public class Arayutility{
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter the number of element: ");
            int n= sc.nextInt();
            int [] num= new int[n];
            int i= 0;
            while (i<n) {
                System.out.println("Please enter your element number " + (i+1) + ": ");
                num[i]= sc.nextInt();
                i++;
            }
     return num; 
    }

    public static void displayArray(int[] numArr){
        int i= 0;
        while(i<numArr.length){
            System.out.println(numArr[i]+ " ");
            i++;
        }
        System.out.println();
    }

    public static int[][] input2DArray() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter the number of rows: ");
            int rows= sc.nextInt();
            System.out.println("Please Enter the number of columns: ");
            int columns= sc.nextInt();
            int [][] numArray= new int[rows][columns];
            int i= 0;
            while (i<rows){
                int j=0;
                while (j<columns) {
                    System.out.println("Please enter element rows: "+ (i+1) + ", column: "+ (j+1) + " :");
                    numArray[i][j]= sc.nextInt();
                    j++;
                }
                i++;
            } 
            return numArray;
    }
    public static void displayArray(int[][] numArr){
        int i= 0;
        while(i<numArr.length){
            System.out.println(numArr[i]+ " ");
            i++;
        }
        System.out.println();
    }
    } 