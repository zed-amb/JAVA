package Week2;

public class EvenOddChecker {
    public static void main(String[] args) {
        int[] arrNum = { 12, 7, 34, 19, 28, 15 };
        checkEvenOdd(arrNum);
    }
    public static void checkEvenOdd(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " is even.");
            } else {
                System.out.println(arr[i] + " is odd.");
            }
        }
    }
}
