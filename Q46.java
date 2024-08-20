package Project;
import java.util.*;
public class Q46 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        /*// Create an array to hold the elements
        int [] array = new int[n];
        // Read the elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Initialize max and min with the first element of the array
        int max = array[0];
        int min = array[0];

        // Find the maximum and minimum values in the array
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);*/

        if (n <= 0) {
            System.out.println("The array must contain at least one element.");
            return;
        }

        int[] array = new int[n];
        int i = 0;

        System.out.println("Enter the elements of the array:");
        while (i < n) {
            array[i] = scanner.nextInt();
            i++;
        }
        int max = array[0];
        int min = array[0];
        i = 1;

        while (i < n) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            i++;
        }

        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
    
    }
}