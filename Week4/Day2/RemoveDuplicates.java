package Week4.Day2;

import java.util.*;

public class RemoveDuplicates {
    /**
     *  Write a Java program that takes a list of integers, removes duplicate values, and prints the result using a set.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a list of integers separated by spaces: ");
        String input = sc.nextLine();
        sc.close();

        List<Integer> integerList = parseInput(input);

        Set<Integer> uniqueSet = new HashSet<>(integerList);

        System.out.println("Unique values:");
        for (Integer value : uniqueSet) {
            System.out.println(value);
        }
    }

    public static List<Integer> parseInput(String input) {
        String[] parts = input.split("\\s+");
        List<Integer> integerList = new ArrayList<>();
        for (String part : parts) {
            try {
                int value = Integer.parseInt(part);
                integerList.add(value);
            } catch (NumberFormatException e) {
                //System.out.println(e);
            }
        }
        return integerList;
    }

}
