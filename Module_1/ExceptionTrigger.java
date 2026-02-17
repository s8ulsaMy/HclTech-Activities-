public class ExceptionTrigger {
    public static void main(String[] args) {
        
        // 1. NullPointerException
        String str = null;
        // str.length(); 

        // 2. ClassCastException
        Object obj = Integer.valueOf(10);
        // String s = (String) obj; 

        // 3. ArrayStoreException
        Object[] stringArray = new String[5];
        // stringArray[0] = 10; // Throws ArrayStoreException (putting int in String array)

        // 4. NegativeArraySizeException
        // int[] arr = new int[-5];

        // 5. OutOfMemoryError (The "thrown but shouldn't catch" case)
        // Long[] heapFiller = new Long[Integer.MAX_VALUE];
    }
}