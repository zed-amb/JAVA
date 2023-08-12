package Week2;

import java.util.Scanner;

public class vowelCounter {
    public static void main(String[] args) {

        /**
         * Create a Java program that takes a sentence as input from the user,
         * counts the number of vowels (a, e, i, o, u).
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any strings: ");
        String words = sc.nextLine();

        int count = 0;
        for (int i = 0; i < words.length(); i++) {
            char c = words.toLowerCase().charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels are: " + count);
    }
}
