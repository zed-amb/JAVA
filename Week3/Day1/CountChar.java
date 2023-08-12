package Week3.Day1;

public class CountChar {
    public static void main(String[] args) {
        String name = "Zelalem";
        char targetChar = 'e';

        int numTarget = countChar(name,targetChar);
        System.out.println("Occurences of " + targetChar + " is " + numTarget);
    }
    public static int countChar(String str,  char c){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==c){
                count ++;
            }
        }
        return count;
    }
}
