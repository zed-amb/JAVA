package Week4.Day1;

import java.util.ArrayList;

public class FindMaxArrayList {
    /**
     * Write a Java program that finds the maximum
     *  element in an ArrayList of integers.
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(30);

        int max = findMax(numbers);
        System.out.println("Maximum element: " + max);
    }

    public static int findMax(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List is null or empty");
        }

        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

}
