package Project;

import java.util.Scanner;

public class SumPositive {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] numArr= Arayutility.inputArray();
        int sum= 0;
        for(int num:numArr){
            if (num<0) {
                continue;
            }
            sum+=num;
        }
        System.out.println("Sum of positive number is: "+sum);
    }
}