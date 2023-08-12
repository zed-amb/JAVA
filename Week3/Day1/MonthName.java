package Week3.Day1;

import java.util.Scanner;

public class MonthName {
    /**
     * Exercise 1: Create a simple program that takes a month number
     * as input and prints the corresponding month name. If not found, print invalid number.
     */

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month number: ");
        int monthNumber = scanner.nextInt();

        String monthName;

        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid number";
                break;
        }

        System.out.println("Month name: " + monthName);
    }


}
