package Week2;

public class Factorial {
    public static void main(String[] args) {

        System.out.println( fact(5));

        System.out.println(facto(5));


        /**
         * Exercise 2. Write a program in Java to reverse a string without using any inbuilt function.
         * Ex : input string = deepak
         *     output string = kapeed
         * Hint : use for loop ,starting from length of string and decrease loop.
         */
        String str = "Deepak";
        String rev ="";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev +=  str.charAt(i);
        }
        System.out.println(rev);


        /**
         * Exercise 3. Write a program in Java to find the largest and smallest elements in an array.
         * Ex : input = {1,9,5,7,8};
         *      output = largest number = 9 & smallest number = 1
         * Hint : use for loop and array here. take first element as largest and smallest and then inside loop compare and
         *        if largest or smaller then set that value to respective largest or smallest.
         */

        int[] arr = {1, 9, 5, 7, 8};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }



    public class AnimalLegsCalculator {
        public static int animals(int chickens, int cows, int pigs) {
            int totalLegs = (chickens * 2) + (cows * 4) + (pigs * 4);
            return totalLegs;
        }

        public static void main(String[] args) {
            int chickensCount = 2;
            int cowsCount = 3;
            int pigsCount = 5;

            int totalLegs = animals(chickensCount, cowsCount, pigsCount);
            System.out.println("Total number of legs of all animals: " + totalLegs);
        }
    }



    /**
     * Exercise 1. Write a program in Java to find the factorial of a number.
     * Factorial :  The product of all positive integers less than or equal to a given positive integer.
     * Ex: 2! (2 Factorial) = 2*1 = 2
     * 3! = 3*2*1 = 6
     * 4! = 4*3*2*1 = 24
     * Hint : Use for loop
     *
     * @return
     */

    public static int fact(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }

    public static int facto(int num){
    /*    if (num < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }*/
        int factNum = 1;
        for (int i = 1; i <= num; i++) {
            factNum*=i;
        }
        return factNum;
    }





}

