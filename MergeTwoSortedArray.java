package Project;
import java.util.*;
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*int[] arr1= Arayutility.inputArray();
        int[] arr2= Arayutility.inputArray();
        int[] mergedArr= merge(arr1, arr2);
        System.out.println("Your Merged Array is: ");
        Arayutility.displayArray(mergedArr);
    }
    public static int[] merge(int[] arr1, int[] arr2){
        int newSize= arr1.length+arr2.length;
        int[] newArr= new int[newSize];
        int i=0, j=0, k=0;
        while (i<arr1.length||j<arr2.length) {
            if(j==arr2.length||(i<arr1.length && arr1[i]<arr2[j])){
                newArr[k]=arr1[i];
                i++;
                k++;
            }
            else {
                newArr[k]=arr2[j];
                k++;
                j++;
            }
        }
        return newArr;*/

        
         // Input first sorted array
         System.out.print("Enter the number of elements in the first sorted array: ");
         int n1 = sc.nextInt();
         int[] arr1 = new int[n1];
         System.out.println("Enter the elements of the first sorted array:");
         for (int i = 0; i < n1; i++) {
             arr1[i] = sc.nextInt();
         }
 
         // Input second sorted array
         System.out.print("Enter the number of elements in the second sorted array: ");
         int n2 = sc.nextInt();
         int[] arr2 = new int[n2];
         System.out.println("Enter the elements of the second sorted array:");
         for (int i = 0; i < n2; i++) {
             arr2[i] = sc.nextInt();
         }
 
         // Merge the arrays
         int[] mergedArray = mergeSortedArrays(arr1, arr2);
 
         // Print the merged array
         System.out.println("Merged sorted array:");
         for (int num : mergedArray) {
             System.out.print(num + " ");
         }
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge the arrays while there are elements in both
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }
         // Copy remaining elements of arr2, if any
         while (j < n2) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }
}