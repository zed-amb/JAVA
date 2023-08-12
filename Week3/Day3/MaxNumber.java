package Week3.Day3;

import java.util.Scanner;

public class MaxNumber {
    /**
     * Write a program in java to find maximum of numbers that will be inputed by user.
     * Ex: 3,5,6  : output will be 6
     * Hint : just use set of comparisons between numbers.
     */

    public class MaximumFinder {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the numbers separated by commas: ");
            String input = scanner.nextLine();

            int max = findMaximum(input);

            System.out.println("Maximum Number: " + max);

            scanner.close();
        }

        public static int findMaximum(String input) {
            String[] numbers = input.split(",");
            int max = Integer.MIN_VALUE;

            for (String numberStr : numbers) {
                int num = Integer.parseInt(numberStr.trim());
                if (num > max) {
                    max = num;
                }
            }

            return max;
        }
    }

}
