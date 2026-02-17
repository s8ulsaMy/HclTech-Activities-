public class Stack {
    private int[] stackArray;
    private int top;
    private int size;

    public Stack(int initialSize) {
        this.size = initialSize;
        this.stackArray = new int[size];
        this.top = -1;
    }

    public void push(int value) {
        if (top == size - 1) {
            // Dynamic resizing: Increase array size if full
            size *= 2;
            int[] newArray = new int[size];
            System.arraycopy(stackArray, 0, newArray, 0, stackArray.length);
            stackArray = newArray;
        }
        stackArray[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stackArray[top--];
    }
}