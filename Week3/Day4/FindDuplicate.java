package Week3.Day4;

public class FindDuplicate {
    /**
     * You are given an array of integers. Write a Java program to find and print
     * the elements that appear more than once in the array.
     * Ex : {1,8,5,8,4,3,4} : Duplicate -> 8,4
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {1, 8, 5, 8, 4, 3, 4};
        findDuplicates(array);
    }

    public static void findDuplicates(int[] array) {
        System.out.print("Duplicate -> ");
        boolean isFirst = true;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    if (!isFirst) {
                        System.out.print(", ");
                    }
                    System.out.print(array[i]);
                    isFirst = false;
                    break;
                }
            }
        }
        System.out.println();
    }
}
