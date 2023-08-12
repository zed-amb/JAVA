package Week2;

public class array {
    public static void main(String[] args) {

        //String[] names = {"Jay", "Deepak", "Sabita"};

        int [] num = {1,2,3,4};

        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println(sum);
    }
}
