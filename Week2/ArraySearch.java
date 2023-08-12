package Week2;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 3, 9, 2};
        int target = 10;
        int result = arraySearch(arr, target);
        if (result != -1) {
            System.out.println("Target found: " + result);
        }
    }
    public static int arraySearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return arr[i];
            }
        }
        System.out.println("Number not found");
        return -1;
    }
}
