//package Lab08;
//class Node {
//    int data;
//    Node prev, next;
//
//    Node(int data) {
//        this.data = data;
//    }
//}
//
//class DoublyLinkedList {
//    private Node head;
//
//    void insertFirst(int data) {
//        Node newNode = new Node(data);
//        if (head != null) head.prev = newNode;
//        newNode.next = head;
//        head = newNode;
//    }
//
//    void insertLast(int data) {
//        Node newNode = new Node(data);
//        if (head == null) { head = newNode; return; }
//        Node current = head;
//        while (current.next != null) current = current.next;
//        current.next = newNode; newNode.prev = current;
//    }
//
//    void deleteByValue(int data) {
//        Node current = head;
//        while (current != null) {
//            if (current.data == data) {
//                if (current.prev != null) current.prev.next = current.next;
//                if (current.next != null) current.next.prev = current.prev;
//                if (current == head) head = current.next;
//                return;
//            }
//            current = current.next;
//        }
//    }
//
//    boolean search(int data) {
//        Node current = head;
//        while (current != null) {
//            if (current.data == data) return true;
//            current = current.next;
//        }
//        return false;
//    }
//
//    void display() {
//        Node current = head;
//        while (current != null) {
//            System.out.print(current.data + " <-> ");
//            current = current.next;
//        }
//        System.out.println("null");
//    }
//}
//
//public class DoublyLinkedListOperations {
//    public static void main(String[] args) {
//        DoublyLinkedList dll = new DoublyLinkedList();
//        
//        dll.insertFirst(10);
//        dll.insertLast(20);
//        dll.insertLast(30);
//        dll.insertFirst(5);
//        
//        System.out.println("List after insertions:");
//        dll.display();
//        
//        dll.deleteByValue(20);
//        System.out.println("List after deleting 20:");
//        dll.display();
//        
//        System.out.println("Searching for 30: " + dll.search(30));
//        System.out.println("Searching for 40: " + dll.search(40));
//    }
//}