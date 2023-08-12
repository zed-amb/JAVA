package Week3.Day1;

public class SortAscending {
    public static void main(String[] args) {
        int[] arr = {10, 8, 3, 6, 8, 9};
        boolean isSorted = checkAscending(arr);
        System.out.println("The array is sorted in ascending order: " + isSorted);
    }
    public static boolean checkAscending(int[] arr ){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> arr[i + 1]){
                return  false;
            }
        }
        return true;
    }
}
