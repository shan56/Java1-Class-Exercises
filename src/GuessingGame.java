/*
I'm thinking about a number. Guess it. If you've ever played that game of some
version of it then you're ready for the next assignment. The computer will "pick"
a number.  Actually, you'll program one in the code.

Create a number-guessing game using a while loop. The loop will allow users to guess
until the secret number is guessed. User get 10 chances to guess the number.
 */

import java.util.Scanner;

public class GuessingGame {
    public static void main(String args[]){
        int secret = 5, guess;
        boolean guessed = false;
        int count = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("I am thinking about a number between 1 and 10...\nCan you guess it?");
        while (!guessed && count < 10) {
            guess = keyboard.nextInt();
            keyboard.nextLine();
            if (guess == secret)
                    guessed = true;
            else {
                if (guess < secret)
                    System.out.print("It's too low. ");
                else
                    System.out.print("It's too high. ");
                count++;

                if (count < 10)
                    System.out.println("Guess again.");
            }
        }

        if (guessed)
            System.out.println("That's right! You are a good guesser.");
        else
            System.out.println("Sorry, you ran out of guesses. The number was " + secret);


    }
}
