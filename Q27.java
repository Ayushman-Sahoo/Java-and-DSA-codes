package Project;
import java.util.*;
public class Q27 {
//LCM of 2 number
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int n= sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int m= sc.nextInt();
        int lcm= lcmof2num(n, m);
        System.out.println("The LCM of two number: " + lcm); 
    }
    public static int lcmof2num(int n, int m) {
        int i=1;
        while(true){
            int factor= n*i;
            if(factor%m==0){
                return factor;
            }
            i++;
        }
    }
}
