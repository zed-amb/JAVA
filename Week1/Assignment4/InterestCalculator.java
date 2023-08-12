package Week1.Assignment4;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");
        double principalAmount = sc.nextDouble();
        System.out.println("Enter rate of interest: ");
        double rateOfInterest = sc.nextDouble();
        System.out.println("Enter the time period in years: ");
        double timePeriod = sc.nextDouble();

        double interestRate = (principalAmount*rateOfInterest*timePeriod)/100;

        System.out.println("Interest expected to be paid from the principal " + principalAmount + " is:  " + interestRate);
    }
}
