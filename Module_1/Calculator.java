public class Calculator {
    public void add(int a, int b) {
        System.out.println("Integer Sum: " + (a + b));
    }

    public void add(double a, double b) {
        System.out.println("Double Sum: " + (a + b));
    }

    public void add(int a, double b) {
        System.out.println("Int + Double Sum: " + (a + b));
    }

    public void add(double a, int b) {
        System.out.println("Double + Int Sum: " + (a + b));
    }

    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.add(10, 20);
        myCalc.add(10.5, 20.5);
        myCalc.add(10, 20.5);
        myCalc.add(10.5, 20);
    }
}