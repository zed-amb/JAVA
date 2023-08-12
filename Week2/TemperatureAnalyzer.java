package Week2;


public class TemperatureAnalyzer {
    public static int findMaxTemperature(int[] temp) {
        int max = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > max) {
                max = temp[i];
            }
        }
        return max;
    }

    public static int findMinTemperature(int[] temp) {
        int min = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] < min) {
                min = temp[i];
            }
        }
        return min;
    }

    public static double findAverageTemperature(int[] temp) {
        int sum = 0;
        for (int i = 0; i < temp.length; i++) {
            sum += temp[i];
        }
        return (double) sum / temp.length;
    }

    public static void main(String[] args) {
        int[] temperatures = {25, 30, 28, 22, 35, 29, 31};

        int maxTemp = findMaxTemperature(temperatures);
        int minTemp = findMinTemperature(temperatures);
        double averageTemp = findAverageTemperature(temperatures);

        System.out.println("Maximum Temperature: " + maxTemp);
        System.out.println("Minimum Temperature: " + minTemp);
        System.out.println("Average Temperature: " + averageTemp);
    }
}
