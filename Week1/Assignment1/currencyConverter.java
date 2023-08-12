package Week1.Assignment1;

import java.util.Scanner;

public class currencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int USD_RATE = 10;
        System.out.println("Enter Currency in Rupees: ");
        double rupeeAmount = sc.nextDouble();

        System.out.println("The converted amount is: " + USD_RATE*rupeeAmount);
    }
}
