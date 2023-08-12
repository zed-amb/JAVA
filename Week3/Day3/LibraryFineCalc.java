package Week3.Day3;

import java.util.Scanner;

public class LibraryFineCalc {
    /**
     * Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:
     *
     * If the book is returned on or before the expected return date, no fine will be charged (i.e.: 0).
     * If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, . fine = 15$ per day after return date
     * If the book is returned after the expected return month but still within the same calendar year as the expected return date, the . fine = 500$ per month after return month
     * If the book is returned after the calendar year in which it was expected, there is a fixed fine  = 1000$
     *
     * Ex : d1,m1,y1 = 12 02 2014  -- returned date
     *      d2,m2,y2 = 12 02 2014  -- due date
     *      output -- fine = 0
     *
     *      d1,m1,y1 = 12 02 2014  -- returned date
     *      d2,m2,y2 = 12 02 2015  -- due date
     *      output -- fine = 1000$
     *
     * Input Format
     *
     * The first line contains 3 space-separated integers denoting the respective dd, mm, and yyyy  on which the book was actually returned.
     * The second line contains 3 space-separated integers denoting the respective dd, mm , and yyyy on which the book was expected to be returned (due date).
     *
     * STDIN       Function
     * -----       --------
     * 9 6 2015    day = 9, month = 6, year = 2015 (date returned)
     * 6 6 2015    day = 6, month = 6, year = 2015 (date due)
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the returned date
        int d1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        // Input for the due date
        int d2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        // Calculate the fine
        int fine = calculateFine(d1, m1, y1, d2, m2, y2);

        // Output the fine
        System.out.println(fine);

        scanner.close();
    }

    public static int calculateFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y1 < y2 || (y1 == y2 && m1 < m2) || (y1 == y2 && m1 == m2 && d1 <= d2)) {
            // Book returned on or before the due date
            return 0;
        } else if (y1 == y2 && m1 == m2) {
            // Book returned within the same calendar month but after the due date
            int daysLate = d1 - d2;
            return 15 * daysLate;
        } else if (y1 == y2 && m1 > m2) {
            // Book returned within the same calendar year but after the due month
            int monthsLate = m1 - m2;
            return 500 * monthsLate;
        } else {
            // Book returned after the calendar year in which it was expected
            return 1000;
        }
    }
}
