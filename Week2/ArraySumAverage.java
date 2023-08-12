package Week2;

import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {

        /**
         * Create a Java program that takes an array of integers as input from the user,
         * calculates the sum and average of the elements, and prints the results.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int length = sc.nextInt();

        int[] array = new int[length];
        int sum = 0;

        System.out.println("Enter array integers: ");
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }

        double average = (double) sum / length;
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + average);
    }
}
