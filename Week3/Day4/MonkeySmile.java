package Week3.Day4;

public class MonkeySmile {
    /**
     * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
     *
     * monkeyTrouble(true, true) → true
     * monkeyTrouble(false, false) → true
     * monkeyTrouble(true, false) → false
     * @param args
     */
        public static void main(String[] args) {
            boolean aSmile = false;
            boolean bSmile = false;
            boolean inTrouble = monkeyTrouble(aSmile, bSmile);
            System.out.println(inTrouble);
        }

        public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
            return (aSmile && bSmile) || (!aSmile && !bSmile);
        }
    }

