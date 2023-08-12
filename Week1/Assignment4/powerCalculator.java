package Week1.Assignment4;

import java.util.Scanner;

public class powerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base number: ");
        int baseNumber = sc.nextInt();

        System.out.println("Enter exponent: ");
        int exponentNumber = sc.nextInt();

        int result = 1;
        for (int i = 0; i<exponentNumber; i++ ){
            result *= baseNumber;
        }
        System.out.println("The output is: "+result);
    }
}
