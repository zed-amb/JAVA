package Week3.Day1;

public class MultiplicationTable {

    /**
     * Exercise 3 : Write a program that prints the multiplication table of a given number.
     *
     * Ex : 2*1 = 2
     *       2*2 = 4 and so on.
     *
     * hint : use for loop

     */
    public static void main(String[] args) {
        int num = 2;
        multiplicationTable(num);
    }
    public static void multiplicationTable(int a){
        for (int i = 1; i <= 12; i++) {
          int result = a*i;
            System.out.println(a + "*" + i + "=" );
        }

    }
}
