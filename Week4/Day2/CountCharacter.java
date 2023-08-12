package Week4.Day2;
import java.util.*;
public class CountCharacter {

    //Given a string, count the frequency of each character using a map
    public static void main(String[] args) {

        String input = "Naabek!";
        Map<Character, Integer> countChar = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (countChar.containsKey(c)) {
                countChar.put(c, countChar.get(c) + 1);
            } else {
                countChar.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : countChar.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }
}
