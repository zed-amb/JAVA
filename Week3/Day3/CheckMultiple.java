package Week3.Day3;

import java.util.Scanner;

public class CheckMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        String result = isMultiple(num1, num2) ? "yes" : "no";

        System.out.println(result);

        scanner.close();
    }

    public static boolean isMultiple(int num1, int num2) {
        return num1 % num2 == 0;
    }
}
