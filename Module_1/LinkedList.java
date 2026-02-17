class Node implements Cloneable {
    int num;
    Node next;

    Node(int num) { this.num = num; }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Basic bitwise copy for the node itself
    }
}

public class LinkedList implements Cloneable {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) { head = newNode; } 
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        LinkedList newList = new LinkedList();
        if (this.head != null) {
            // Manually copying each node to ensure a Deep Copy
            newList.head = new Node(this.head.num);
            Node current = this.head.next;
            Node newCurrent = newList.head;
            while (current != null) {
                newCurrent.next = new Node(current.num);
                newCurrent = newCurrent.next;
                current = current.next;
            }
        }
        return newList;
    }
}