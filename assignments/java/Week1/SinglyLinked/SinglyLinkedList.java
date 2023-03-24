// package assignments.java.Week1.SinglyLinked;

public class SinglyLinkedList {
    public Node head;
    public Node runner;

    public SinglyLinkedList() {
        this.head = null;
    }

    // SLL methods go here. As a starter, we will show you how to add a node to the
    // list.
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove() {
        if (head == null) {
            return;
        } else {
            Node prev = null;
            Node current = head;
            while (current.next.next != null) {
                prev = current;
                current = current.next;
            }
            current.next = null;
        }
    }

    public void find(int value) {
        Node findNode = new Node(value);
        if (head == null) {
            return;
        }
    }

    public void printValues() {
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}
