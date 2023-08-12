package Week3.Day5;

public class Exercise1 {
    public class Main {
        public static int sumDouble(int a, int b) {
            if (a == b) {
                return 2 * (a + b);
            } else {
                return a + b;
            }
        }

        public static void main(String[] args) {
            System.out.println(sumDouble(1, 2)); // Output: 3
            System.out.println(sumDouble(3, 2)); // Output: 5
            System.out.println(sumDouble(2, 2)); // Output: 8
        }
    }
}
