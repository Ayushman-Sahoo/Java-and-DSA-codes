package Project;
import java.util.*;
public class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       /* int[]numArr= Arayutility.inputArray();
        boolean isPalin= isPalindrome(numArr);
        if (isPalin) {
            System.out.println("Your array is a Palindrome.");
        }
        else{
            System.out.println("Your array is not a Palindrome.");
        }
    }
    public static boolean isPalindrome(int[] numArr){
        int i=0;
        while (i<numArr.length/2) {
            if(numArr[i]!=numArr[numArr.length-1-i]){
                return false;
            }
            i++;
        }
        return true; */

         // Taking the size of the array as input
         System.out.print("Enter the number of elements in the array: ");
         int n = sc.nextInt();
 
         int[] array = new int[n];
 
         // Taking array elements as input
         System.out.println("Enter the elements of the array:");
         for (int i = 0; i < n; i++) {
             array[i] = sc.nextInt();
         }
 
         // Checking if the array is a palindrome using for loop
         boolean isPalindromeForLoop = checkPalindromeForLoop(array);
         System.out.println("Using for loop, is the array a palindrome? " + isPalindromeForLoop);
 
         // Checking if the array is a palindrome using while loop
         boolean isPalindromeWhileLoop = checkPalindromeWhileLoop(array);
         System.out.println("Using while loop, is the array a palindrome? " + isPalindromeWhileLoop);

     }
     public static boolean checkPalindromeForLoop(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            if (array[i] != array[n - 1 - i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkPalindromeWhileLoop(int[] array) {
        int n = array.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (array[left] != array[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}