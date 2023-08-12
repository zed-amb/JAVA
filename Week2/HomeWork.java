package Week2;

public class HomeWork {
    public static void main(String[] args) {
        String[] studentName = {"Zelalem", "Jay", "Sabita", "Linn"};

        boolean found = false;
        for (int i = 0; i < studentName.length; i++) {
            if (studentName[i].equals("Jay")){
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println( " the student exist.");
        } else {
            System.out.println("No such student name in the bootcamp.");
        }
    }
}
