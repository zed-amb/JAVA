package Week3.Day2;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {

        /**
         * For any input, if the value entered is other than 1 or 2, keep looping until the user enters a correct value.
         * Ex : entered value 10  -> output ,please enter correct value continue,
         * Hint : use appropriate loop
         */

        Scanner sc = new Scanner(System.in);
        int userInput;

        do {
            System.out.print("Please enter 1 or 2: ");
            userInput = sc.nextInt();

            if (userInput != 1 && userInput != 2) {
                System.out.println("Invalid input. Please enter 1 or 2.");
            }
        } while (userInput != 1 && userInput != 2);

        System.out.println("Valid input received: " + userInput);
    }
}
