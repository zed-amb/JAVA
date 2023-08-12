package Week1.Assignment4;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks obtained out of 100: ");
        double studentScore = sc.nextDouble();

        if (studentScore >= 90 && studentScore <=100){
            System.out.println("A");
        } else if (studentScore >= 80 && studentScore < 90) {
            System.out.println("B");
        } else if (studentScore >= 70 && studentScore < 80) {
            System.out.println("C");
        } else if (studentScore >= 60 && studentScore < 70) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
