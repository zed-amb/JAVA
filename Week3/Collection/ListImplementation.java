package Week3.Collection;

import java.util.ArrayList;
import java.util.List;

public class ListImplementation {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(9);
        s.add(10);
        s.add(6);
        s.add(7);
        s.add(3);

        System.out.println(s.size());
        System.out.println(s);

        for (Integer elem : s) {
            System.out.println(elem);
        }
    }

}
