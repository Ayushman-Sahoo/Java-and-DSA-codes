package Project;

import java.util.*;
public class Q47 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n= scanner.nextInt();

        // Create an array to hold the input numbers
        int[] array = new int[n];
        
        // Prompt user to input elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Sort the array
        Arrays.sort(array);
        
        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}