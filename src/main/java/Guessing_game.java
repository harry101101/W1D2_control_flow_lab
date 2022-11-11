//Getting Scanner and random classes
import java.sql.DataTruncation;
import java.util.Scanner;
import java.util.Random;
public class Guessing_game {
    public static void main(String[] args) {
        //Generating random secret number between 1 and 1000
        Random rand = new Random();
        int secret_number = rand.nextInt(1000) + 1;
        //System.out.println(secret_number);

        int count =0;
        while (true) {
            //Getting guess from player
            System.out.println("Guess the secret number between 1 and 1000:");
            Scanner reader = new Scanner(System.in);
            int guess = reader.nextInt();
            count += 1;

            //Checking guess
            if (guess == secret_number) {
                System.out.println("Correct! You guessed the secret number in " + count + " attempts!");
                break;
            } else if (guess > secret_number) {
                System.out.println("Too high, try again!");
            } else {
                System.out.println("Too low, try again!");
            }

        }


    }
}