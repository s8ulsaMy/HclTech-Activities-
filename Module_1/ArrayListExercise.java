import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Insert
        list.add(10);
        list.add(20);
        list.add(30);

        // Find/Search
        if (list.contains(20)) {
            System.out.println("Found 20 at index: " + list.indexOf(20));
        }

        // Delete
        list.remove(Integer.valueOf(30));

        System.out.println("Final List: " + list);
    }
}