package Project;
import java.util.*;
public class Search2Darray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] numArr= Arayutility.input2DArray();
        System.out.println("Now enter the number you want to search: ");
        int searchNum= sc.nextInt();
        boolean isFound= search(numArr, searchNum);
        if (isFound) {
            System.out.println("Your number was Found.");
        }
        else{
            System.out.println("Your number was not found.");
        }
    }
    public static boolean search(int[][] numArr, int num){
        int i=0;
        while (i<numArr.length) {
            int j=0;
            while (j<numArr[i].length) {
                if (numArr[i][j]==num) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
