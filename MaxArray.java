package Project;
import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr= Arayutility.inputArray();
        int max= Integer.MIN_VALUE;
        for(int num:arr){
            if (max<num) {
                max=num;
            }
        }
        System.out.println("Maximum number is: " + max);
    }
}
