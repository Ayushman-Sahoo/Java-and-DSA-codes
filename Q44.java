package Project;
import java.util.*;
public class Q44 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int n= sc.nextInt();
        int[] array= new int[n];
        // Taking array elements as input
         System.out.print("Enter the elements of the array:");
         for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Calculate the sum of the elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        // Calculate the average of the elements
        double average = (double) sum / n;

        // Print the sum and average
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + average);









        
       /* System.out.println("Welcome to Array Sum and Average");
        int[] numArray= Arayutility.inputArray();
        int sum= sum(numArray);
        double avg= avg(numArray);
        System.out.println("Sum of the elements: "+ sum);
        System.out.println("Average of the elements: "+ avg);
    }
    public static int sum(int[] numArray){
        long sum=0; 
        int i= 0;
        while (i<numArray.length) {
            sum+= numArray[i];
            i++;
        }
        return sum;
    }

    public static double avg(double[] numArray){
        int sum= sum(numArray);
        return sum/numArray.length;*/
    }
}