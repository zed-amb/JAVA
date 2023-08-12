package Week1.Assignment1;

import java.util.Scanner;

public class studentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Students in the class? ");
        int numberOfStudents = sc.nextInt();

        double totalScore = 0;

        System.out.println("Enter score for each student: ");
        for (int i = 0; i < numberOfStudents; i++) {
            double studentScore = sc.nextDouble();
            totalScore += studentScore;
        }

        double averageScore = totalScore / numberOfStudents;
        System.out.println("Average grade: " + averageScore);
    }
}
