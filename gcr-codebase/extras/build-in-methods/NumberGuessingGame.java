import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    static int generateGuess(int low, int high) {
        return (low + high) / 2; // Smart guessing (Binary Search)
    }

    static char getFeedback(Scanner sc) {
        System.out.print("Is the guess High(H), Low(L), or Correct(C)? ");
        return sc.next().toUpperCase().charAt(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        boolean guessed = false;

        System.out.println("Think of a number between 1 and 100");

        while (!guessed) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guess: " + guess);

            char feedback = getFeedback(sc);

            if (feedback == 'H') {
                high = guess - 1;
            } else if (feedback == 'L') {
                low = guess + 1;
            } else if (feedback == 'C') {
                System.out.println("Computer guessed correctly!");
                guessed = true;
            } else {
                System.out.println("Invalid input!");
            }
        }
        sc.close();
    }
}
