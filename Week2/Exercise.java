package Week2;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of the array: ");
        int length = sc.nextInt();

        int[] arr = new int[length];

        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        System.out.println("Output:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("index[" + i + "] = " + arr[i]);
            sum += arr[i];
        }
        System.out.println("Sum is: " + sum);
    }
}
