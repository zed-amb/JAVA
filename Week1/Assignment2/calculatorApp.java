package Assignment2;

import java.util.Scanner;

public class calculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double firstNumber = sc.nextDouble();

        System.out.println("Enter second number: ");
        double secondNumber = sc.nextDouble();

        System.out.println("Enter operator");
        String operation = sc.next();

        double result = 0;

        if (operation.equals("+")) {
            result = firstNumber + secondNumber;
        } else if (operation.equals("-")) {
            result = firstNumber - secondNumber;
        } else if (operation.equals("*")) {
            result = firstNumber * secondNumber;
        } else if (operation.equals("/")) {
            result = firstNumber / secondNumber;
        } else {
            System.out.println("Please, enter valid operation +,-,*, or /");
            return;
        }

        System.out.println("Output: " + firstNumber + " " + operation + " " + secondNumber + " = " + result);
    }
}
