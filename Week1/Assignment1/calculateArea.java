package Week1.Assignment1;

import java.util.Scanner;

public class calculateArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: ");
        double length = sc.nextDouble();
        System.out.println("Enter breadth: ");
        double breadth = sc.nextDouble();
        double area = length*breadth;

        System.out.println("Area of the rectangle is: " + area);
    }
}
