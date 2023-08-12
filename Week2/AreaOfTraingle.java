package Week2;

public class AreaOfTraingle {
    public static void main(String[] args) {
        int base = 3;
        int height = 2;
        double area = triArea(base, height);
        System.out.println("The area of the triangle is: " + area);
    }

    public static double triArea(int base, int height) {
        return (base * height) / 2.0;
    }
}
