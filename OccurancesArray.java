package Project;
import java.util.Scanner;
//number of occurances 
public class OccurancesArray {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
       /* // Get the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        // Declare and initialize the array
        int[] array = new int[size];

        // Get the array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }   
        // Get the element to count
        System.out.print("Enter the element to count: ");
        int elementToCount = scanner.nextInt();

        // Count occurrences using a while loop
        int count = 0;
        int i = 0;
        while (i < size) {
            if (array[i] == elementToCount) {
                count++;
            }
            i++;
        }
         // Display the result
         System.out.println("The element " + elementToCount + " occurs " + count + " times in the array.");*/
       
         /*int occ= 0;
        int i= 0;
        while (i<newArray.length) {
            if (numArr[i]==num) {
                occ++;
            }
            i++;
        }
        return occ; */ 
         
         
        // Get the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        // Declare and initialize the array
        int[] array = new int[size];

        // Get the array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Get the element to count
        System.out.print("Enter the element to count: ");
        int elementToCount = scanner.nextInt();
        // Count occurrences using a for loop
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == elementToCount) {
                count++;
            }
        }

        // Display the result
        System.out.println("The element " + elementToCount + " occurs " + count + " times in the array.");
    }
}