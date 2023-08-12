package Week2;

import java.util.Scanner;

public class StudentGrades {
    static int[] grades = new int[5];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for grades of five students
        System.out.println("Enter the grades of students:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }


        double averageGrade = getAverageGrade();
        char gradeLetter = getGradeLetter(averageGrade);
        boolean isPassing = isPassing(averageGrade);
        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("   Average Grade: " + averageGrade);
            System.out.println("   Grade Letter: " + gradeLetter);
            System.out.println("   Pass/Fail: " + (isPassing ? "Pass" : "Fail")); //
            System.out.println();
        }
    }

    public static double getAverageGrade() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.length;
    }

    public static char getGradeLetter(double averageGrade) {
        if (averageGrade >= 90) {
            return 'A';
        } else if (averageGrade >= 80) {
            return 'B';
        } else if (averageGrade >= 70) {
            return 'C';
        } else if (averageGrade >= 60) {
            return 'D';
        } else {
            return 'E';
        }
    }

    public static boolean isPassing(double averageGrade) {
        return averageGrade >= 60;
    }
}
