// package assignments.java.Week1.SinglyLinked;

public class SinglyLinkedList {
    public Node head;
    public Node runner;
    public Node tail;
    public int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
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

    // tail is provided and we're adding a node to the end of the list
    public void addFront(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void addBack(int value) {
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;

        if (head == null) {
            head = tail;
        }
        size++;
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

    public void printValues() {
        Node current = head; // temp variable not reassigning head
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("End of list");

    }
}
