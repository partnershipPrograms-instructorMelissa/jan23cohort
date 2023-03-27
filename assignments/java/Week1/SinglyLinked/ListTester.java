// package assignments.java.Week1.SinglyLinked;

public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList singlell = new SinglyLinkedList();
        singlell.add(3);
        singlell.add(4);
        singlell.add(10);
        singlell.add(5);
        singlell.add(15);
        singlell.add(2);
        singlell.addFront(38);
        singlell.addFront(30);
        singlell.addBack(39);
        singlell.addBack(19);
        // singlell.remove();
        // singlell.remove();
        // singlell.find(4);
        singlell.insertIndex(16, 2);
        singlell.printValues();
    }
}
