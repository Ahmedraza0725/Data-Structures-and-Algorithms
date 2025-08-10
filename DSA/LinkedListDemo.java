//package Lab08;
//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//    }
//}
//
//class UnsortedLinkedList {
//    private Node head;
//
//    void insert(int data) {
//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
//    }
//
//    void display() {
//        Node current = head;
//        while (current != null) {
//            System.out.print(current.data + " -> ");
//            current = current.next;
//        }
//        System.out.println("null");
//    }
//}
//
//class SortedLinkedList {
//    private Node head;
//
//    void insert(int data) {
//        Node newNode = new Node(data);
//        if (head == null || head.data >= data) {
//            newNode.next = head;
//            head = newNode;
//            return;
//        }
//        Node current = head;
//        while (current.next != null && current.next.data < data) {
//            current = current.next;
//        }
//        newNode.next = current.next;
//        current.next = newNode;
//    }
//
//    void display() {
//        Node current = head;
//        while (current != null) {
//            System.out.print(current.data + " -> ");
//            current = current.next;
//        }
//        System.out.println("null");
//    }
//}
//
//public class LinkedListDemo {
//    public static void main(String[] args) {
//        UnsortedLinkedList unsortedList = new UnsortedLinkedList();
//        SortedLinkedList sortedList = new SortedLinkedList();
//
//        // Inserting elements into the unsorted linked list
//        unsortedList.insert(30);
//        unsortedList.insert(10);
//        unsortedList.insert(20);
//        System.out.println("Unsorted Linked List:");
//        unsortedList.display();
//
//        // Inserting elements into the sorted linked list
//        sortedList.insert(30);
//        sortedList.insert(10);
//        sortedList.insert(20);
//        System.out.println("Sorted Linked List:");
//        sortedList.display();
//    }
//}