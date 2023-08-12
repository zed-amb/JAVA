package Week4.Day1;

import java.util.ArrayList;

public class MergeTwoArrayList {

    /**
     * Write a Java program that merges
     * two ArrayLists of integers and prints the
     * resulting merged ArrayList.
     */
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(15);
        list2.add(25);
        list2.add(35);

        ArrayList<Integer> mergedList = mergeTwoArray(list1, list2);

        System.out.println("Merged ArrayList: " + mergedList);
    }
    public static ArrayList<Integer> mergeTwoArray(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> merged = new ArrayList<>();

        merged.addAll(a);
        merged.addAll(b);

        return merged;
    }

}
