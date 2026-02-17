public class ExceptionDelegation {
    // Methods delegate the exception using 'throws'
    public static int div(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            // Caller handles the exception
            System.out.println(div(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
    }
}