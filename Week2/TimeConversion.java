package Week2;

public class TimeConversion {
    public static void main(String[] args) {
        int hours = 5;
        int seconds = convertToSeconds(hours);
        System.out.println(hours + " hours is =" + seconds + " seconds.");
    }

    public static int convertToSeconds(int hours) {
        return hours * 3600;
    }
}
