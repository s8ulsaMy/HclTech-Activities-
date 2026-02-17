public class StringExercise {
    public static void main(String[] args) {
        // 1. Declare the string
        String str = "The quick brown fox jumps over the lazy dog";

        // 2. Print the character at the 12th index (0-indexed)
        // 'h' is at 1, 'e' is at 2... the 12th index is 'r' (in "brown")
        System.out.println("Character at 12th index: " + str.charAt(12));

        // 3. Check whether the String contains the word "is"
        System.out.println("Contains 'is': " + str.contains("is"));

        // 4. Add the string "and killed it" to the existing string
        str = str.concat(" and killed it");
        System.out.println("Concatenated String: " + str);

        // 5. Check whether the String ends with the word "dogs"
        // Note: It now ends with "it", so this will be false
        System.out.println("Ends with 'dogs': " + str.endsWith("dogs"));

        // 6. Check equality with "The quick brown Fox jumps over the lazy Dog"
        // (Case-sensitive check)
        String check1 = "The quick brown Fox jumps over the lazy Dog";
        System.out.println("Equals (Case-sensitive): " + str.equals(check1));

        // 7. Check equality with "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"
        // (Case-insensitive check)
        String check2 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        System.out.println("Equals (Case-insensitive): " + str.equalsIgnoreCase(check2));
    }
}