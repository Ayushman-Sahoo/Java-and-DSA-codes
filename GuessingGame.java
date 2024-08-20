package Project;
import java.util.Scanner;

public class GuessingGame {
    int random;
    GuessingGame(){
        random= (int) Math.ceil(Math.random()*100);
    }
    /**
     * 
     * @param guessnumber
     * @return
     * Negeative number if guessed number is smaller
     * 0 if the guessed number is correct
     * Positive number if the guessed number is higher 
     */
    int guess(int guessnumber){
        return guessnumber-random;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        GuessingGame game= new GuessingGame();
        System.out.print("Welcome to Guessing game. Guess the number between 1-100: ");
        int guess;
        int result;
        do{
            guess= sc.nextInt();
            result= game.guess(guess);
            if (result==0) {
                System.out.println("Congrats, your guess is correct.");
            }
         else if(result<0) {
            System.out.println("Your guess is smaller than the number. Try again. ");
         }   
         else{
            System.out.println("Your guess is higher than the number. Try again. ");
         }
        }while (result!=0);
    }
}
