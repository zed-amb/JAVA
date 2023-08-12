package Week1.Assignment3;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the limit: ");
        int numberLimit = sc.nextInt();
        if (numberLimit<=0){
            System.out.println("Please enter number greater than 0! ");
        }else {
            System.out.println("Here is the result.");
        }

        for (int i = 1; i <= numberLimit; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
