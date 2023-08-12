package Week3.Day2;

public class StringConversion {
    public static void main(String[] args) {

        /**
         *  Write java program to convert a string to an array.
         * Ex : "how are you" -> {"how","are","you"}
         * hint : use split .
         */
        String inputString = "how are you";
        String[] result = inputString.split(" ");

        System.out.print("{");
        for (int i = 0; i < result.length; i++) {
            System.out.print("\"" + result[i] + "\"");
            if (i < result.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
}
