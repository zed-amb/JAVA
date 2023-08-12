package Week2;

public class FindWord {
    public static void main(String[] args) {
        /**
         * Exercise 1:Find the word
         * Starting with an input string of words, find the second-to-last word of the string. For example,
         * an input of “I love Codecademy” should return “love.”
         * To make your program more challenging, allow for a second numerical input, n, that results in returning
         * the nth word of a string. So, for the string “I can program in Java” and n = 3, the output should be the third word, “program.”
         */
        String sentence = "I can program in Java";
        int n = 3;
        String word = findNthWord(sentence, n);
        System.out.println("The third word is: " + word);
    }

    public static String findNthWord(String sentence, int n) {
        String[] words = sentence.split(" ");
        if (n >= 1 && n <= words.length) {
            return words[n - 1];
        } else {
            return "there is no enough word " + n + ".";
        }
    }
}
