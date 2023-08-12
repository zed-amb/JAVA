package Week1.Assignment1;

import java.util.Scanner;

public class billCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter bill Amount: ");
        double billAmount = sc.nextDouble();

        final double TAX_RATE = 0.15;
        double taxAmount = billAmount * TAX_RATE;

        System.out.println("Add tip: ");
        double tipAmount = sc.nextDouble();

        double totalBillAmount = billAmount + taxAmount + tipAmount;
        System.out.println("Total bill amount: " + totalBillAmount);
    }
}
