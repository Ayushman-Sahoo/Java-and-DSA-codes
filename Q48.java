package Project;
import java.util.Scanner;

public class Q48 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome to Array Deletation.");
        // Ask the user for the size of the array
         System.out.print("Enter the size of the array: ");
         int size = scanner.nextInt();
 
        // Initialize the array
        int[] array = new int[size];
        // Ask the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Ask the user for the element to delete
        System.out.print("Enter the element to delete: ");
        int elementToDelete = scanner.nextInt();

        // Call the method to delete the element
        int[] newArray = deleteElement(array, elementToDelete);

        // Display the new array
        System.out.println("New array after deleting the element:");
        for (int value : newArray) {
            System.out.print(value + " ");
        }
    }

    // Method to delete an element from an array
    public static int[] deleteElement(int[] array, int element) {
        int count = 0;

        // Count occurrences of the element to delete
        for (int i : array) {
            if (i == element) {
                count++;
            }
        }

        // If the element is not found, return the original array
        if (count == 0) {
            return array;
        }

        // Create a new array with the new size
        int[] newArray = new int[array.length - count];
        int index = 0;

        // Add elements to the new array excluding the element to delete
        for (int i : array) {
            if (i != element) {
                newArray[index++] = i;
            }
        }
        return newArray;
       /* int[] numArr= Arayutility.inputArray();
        System.out.println("Enter the element to delete: ");
        int numToDelete= scanner.nextInt();
        int[] newArray= deleteNumber(numArr, numToDelete);
        System.out.println("Here is your Array: "); 
        Arayutility.displayArray(numArr);
    }   
    public static int[] deleteNumber(int[] newArray, int numToDelete) {
        
    }  */
    }
}