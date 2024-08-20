package Project;
import java.util.*;
public class Q42 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcoming to array searching. ");
        System.out.print("Enter the array to search: ");
        int num= sc.nextInt();
        int[] arr= new int[num];
        boolean isfound= isfound(arr, num);
        if (isfound) {
            System.out.println("Your number is found in the array.");
        }
        else{
            System.out.println("Your number is not found in the array.");
        }
    }
    public static boolean isfound(int[] arr, int num){
        int index=0;
        while (index<arr.length) {
            if (arr.length==num) {
                return true;
            }
            index++;
        }
        return false;
    }
}
