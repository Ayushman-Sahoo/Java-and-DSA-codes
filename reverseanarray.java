package Project;
import java.util.*;
public class reverseanarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*int[] numArr= Arayutility.inputArray();
        reverse(numArr);
        System.out.print("Your reverse array is: ");
        Arayutility.displayArray(numArr);
    }
    public static void reverse(int[] arr){
        int i=0;
        while (i< arr.length/2) {
            int swap= arr[i];
            arr[i]= arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]= swap;
            i++;
        }*/
         // Input the size of the array
         System.out.print("Enter the size of the array: ");
         int size = sc.nextInt();
 
         // Declare the array and input elements
         int[] array = new int[size];
         System.out.println("Enter the elements of the array:");
         for (int i = 0; i < size; i++) {
             array[i] = sc.nextInt();
         }
 
         // Reverse the array
         reverseArray(array);
 
         // Print the reversed array
         System.out.println("Reversed array:");
         for (int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
    }

    // Method to reverse the array
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            // Swap the elements
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
