package Week2;

public class FreeCoffe {

        public static void main(String[] args) {
            int n = 6;
            int total = totalCups(n);
            System.out.println("Total cups received: " + total);
        }

        public static int totalCups(int n) {
            int freeCups = n / 6;
            return n + freeCups;
        }
    }
