package Week1.Assignment4;

import java.util.Scanner;

public class coffeeShop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Coffee Shop!");
        System.out.println("Menu:");
        System.out.println("1. Espresso ($10)");
        System.out.println("2. Latte ($15)");
        System.out.println("3. Cappuccino ($5)");
        System.out.println("4. Americano ($18)");
        System.out.print("Enter the number of your desired coffee: ");

        int coffeeChoice = sc.nextInt();
        int totalPrice = 0;

        switch (coffeeChoice) {
            case 1:
                totalPrice = 10;
                break;
            case 2:
                totalPrice = 15;
                break;
            case 3:
                totalPrice = 5;
                break;
            case 4:
                totalPrice = 18;
                break;
            default:
                System.out.println("Invalid choice. Please select a valid coffee from the menu.");
                System.exit(0);
        }

        System.out.println("Your total price is $" + totalPrice);
    }
}
