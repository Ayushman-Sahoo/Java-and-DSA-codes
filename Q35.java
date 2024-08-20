package Project;
import java.util.*;
public class Q35 {
//reverse of number
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        long num= sc.nextLong();
        long reverse= reverse(num);
        System.out.println("Reverse Number is: " + reverse);
    }
    public static long reverse(long num) {
        long newnum= 0;
        while(num!=0){
            long rem= (num % 10);
            newnum= newnum*10+ rem;
            num= num/10;
        }
        return newnum;
    }
}
