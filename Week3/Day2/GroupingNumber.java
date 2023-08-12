package Week3.Day2;
import java.util.Scanner;
public class GroupingNumber {


    public class NumberClassification {
        public static void main(String[] args) {
            /**
             * Write a program that inputs five numbers and determines and prints the number of negative
             * numbers input,the number of positive numbers & input and the number of zeros input.
             * Ex: 3,6,0,6,3,-4,-2 : negative number : 2 ,positive number : 4 ,zero : 1
             * Hint can use array to store elements and loop to check accordingly
             */
            Scanner sc = new Scanner(System.in);
            int[] numbers = new int[5];
            int positive= 0;
            int negative = 0;
            int zeroCount = 0;


            System.out.println("Enter five numbers:");
            for (int i = 0; i < 5; i++) {
                numbers[i] = sc.nextInt();
            }


            for (int num : numbers) {
                if (num > 0) {
                    positive++;
                } else if (num < 0) {
                    negative++;
                } else {
                    zeroCount++;
                }
            }

            System.out.println("Negative numbers: " + negative);
            System.out.println("Positive numbers: " + positive);
            System.out.println("Zero numbers: " + zeroCount);
        }
    }

}
