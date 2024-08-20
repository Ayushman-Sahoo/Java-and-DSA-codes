package Project;
import java.util.Scanner;

public class ArraytoString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] arr= new String[] {"This" + "is" + "the" + "most" + "beautiful" + "course."};
        StringBuilder sb= new StringBuilder();
        for(String str:arr){
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
