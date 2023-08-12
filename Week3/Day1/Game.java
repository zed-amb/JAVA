package Week3.Day1;

public class Game {
    /**
     * Create a program that implements a basic text-based game using core Java concepts like classes, objects, loops, and conditional statements.
     *               The game is a simple "guess the number" game where the player needs to guess a randomly generated number within a given range.
     *              In this game, the player first sets the range of numbers within which the secret number will be generated.
     *              The program then randomly generates a secret number within that range.The player has a maximum number of
     *              attempts (5 in this case) to guess the secret number correctly. After each guess, the program provides feedback to the player,
     *              telling them whether the guessed number is too high or too low. If the player guesses the correct number, the game ends with a congratulatory message.
     *              If the player uses all the attempts without guessing the correct number, the game ends with a message revealing the secret number.
     *
     * Ex : Welcome to the Guess the Number game!
     * Enter the range of numbers (minimum and maximum, separated by a space): 1 50
     * I've selected a number between 1 and 50.
     * You have 5 attempts to guess the number.
     *
     * Attempt #1: Enter your guess: 25
     * Try a lower number.
     *
     * Attempt #2: Enter your guess: 12
     * Try a higher number.
     *
     * Attempt #3: Enter your guess: 18
     * Try a higher number.
     *
     * Attempt #4: Enter your guess: 21
     * Congratulations! You've guessed the correct number 21 in 4 attempts.
     *
     * Hint : First take input from user for max range and min range ,let it be 1 and 10.
     *        Generate secret number by using inbuilt class Random random = new Random();with formula :
     *        int secretNumber =  random.nextInt(maxRange - minRange + 1) + minRange;
     *        Take maxAttempts as 5.
     *        use while loop to check until count reached maxAttempts.
     *        Take guess from user inside while loop.
     *        compare secret number with guessnumber entered by user.
     *        If equals : congrulation
     *        If greater : try a lower number
     *        If less : try a higher number.
     */
}
