//package Lab07;
//class Node {
//    int data;
//    Node next;
//
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//class LinkedList {
//    Node head;
//
//    // Method to check if the linked list is empty
//    public boolean isEmpty() {
//        return head == null;
//    }
//
//    // Method to insert a new node at the end of the list
//    public void insert(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//        } else {
//            Node current = head;
//            while (current.next != null) {
//                current = current.next;
//            }
//            current.next = newNode;
//        }
//    }
//
//    // Method to display the linked list
//    public void display() {
//        Node current = head;
//        while (current != null) {
//            System.out.print(current.data + " -> ");
//            current = current.next;
//        }
//        System.out.println("null");
//    }
//}
//
//public class CheckLinkedListEmpty {
//    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//
//        // Check if the linked list is empty
//        System.out.println("Is the linked list empty? " + list.isEmpty());
//
//        // Insert an element into the linked list
//        list.insert(10);
//        System.out.println("After inserting an element:");
//        list.display();
//
//        // Check again if the linked list is empty
//        System.out.println("Is the linked list empty? " + list.isEmpty());
//    }
//}
