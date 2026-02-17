public class StringExercise_2 {
    public static void main(String[] args) {
        String str = "The quick brown Fox jumps over the lazy Dog";

        // 1. Find the length of the String
        System.out.println("Length: " + str.length());

        // 2. Check whether the String matches "The quick brown Fox jumps over the lazy Dog"
        boolean matches = str.equals("The quick brown Fox jumps over the lazy Dog");
        System.out.println("Matches: " + matches);

        // 3. Replace the word "The" with the word "A"
        String replacedStr = str.replace("The", "A");
        System.out.println("Replaced: " + replacedStr);

        // 4. Split the string into two such that two animal names do not come together
        // Splitting after 'Fox' separates the two animals
        String[] parts = str.split(" jumps ");
        System.out.println("Part 1: " + parts[0]);
        System.out.println("Part 2: " + parts[1]);

        // 5. Print the animal names alone separately
        // Taking 'Fox' and 'Dog' from the original string
        String animal1 = str.substring(16, 19);
        String animal2 = str.substring(40, 43);
        System.out.println("Animal 1: " + animal1);
        System.out.println("Animal 2: " + animal2);

        // 6. Print the string in completely lower case
        System.out.println("Lower Case: " + str.toLowerCase());

        // 7. Print the string in completely upper case
        System.out.println("Upper Case: " + str.toUpperCase());

        // 8. Find the index position of the character 'a'
        System.out.println("Index of 'a': " + str.indexOf('a'));

        // 9. Find the last index position of the character 'e'
        System.out.println("Last index of 'e': " + str.lastIndexOf('e'));
    }
}