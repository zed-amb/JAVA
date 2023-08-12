package Week3.Day1;

public class SortDescending {
    public static boolean checkDescending(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
