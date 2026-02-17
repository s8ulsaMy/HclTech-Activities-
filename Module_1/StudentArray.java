public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Amit", "Sita", "Rahul", "Priya", "Vikram", "Anjali", "Karan", "Sneha", "Rohan", "Meera"};

        // StringBuilder is more memory efficient than String concatenation in loops
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < students.length; i++) {
            sb.append(students[i]);
            if (i < students.length - 1) sb.append(", ");
        }

        System.out.println(sb.toString());
    }
}