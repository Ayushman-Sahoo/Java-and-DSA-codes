package Project;
import java.util.*;
public class SumofdiagonalArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] numArr= Arayutility.input2DArray();
        long sum= sumofdiagonalarray(numArr);
        System.out.println("sum of diagonal is: "+ sum);

    }
    public static long sumofdiagonalarray(int[][] numArr){
        long leftSum= sumofleftdiagonalarray(numArr);
        long rightSum= sumofrightdiagonalarray(numArr);
        long sum= leftSum+rightSum;
        if (numArr.length%2!=0) {
            int ind= numArr.length/2;
            sum-= numArr[ind][ind];
        }
        return sum;
    }
    public static long sumofleftdiagonalarray(int[][] numArr){
        long sum=0;
        int i=0;
        while (i<numArr.length) {
            sum+=numArr[i][i];
            i++;
        }
        return sum;
    }
    public static long sumofrightdiagonalarray(int[][] numArr){
        long sum=0;
        int i=0;
        while (i<numArr.length) {
            int column= numArr.length-1-i;
            sum+=numArr[i][column];
            i++;
        }
        return sum;
    }
}