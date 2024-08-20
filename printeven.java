package Project;
import java.util.Scanner;

public class printeven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<=100; i++){
            if(i%2==1){
                continue;
            }
            System.out.println(i);
        }
    }
}
