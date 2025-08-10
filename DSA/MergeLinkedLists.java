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
//
//    // Method to merge two linked lists using the runner technique
//    public static LinkedList merge(LinkedList list1, LinkedList list2) {
//        LinkedList mergedList = new LinkedList();
//        Node runner1 = list1.head;
//        Node runner2 = list2.head;
//
//        while (runner1 != null && runner2 != null) {
//            mergedList.insert(runner1.data);
//            mergedList.insert(runner2.data);
//            runner1 = runner1.next;
//            runner2 = runner2.next;
//        }
//
//        // If there are remaining nodes in either list (not expected in equal lists)
//        while (runner1 != null) {
//            mergedList.insert(runner1.data);
//            runner1 = runner1.next;
//        }
//        while (runner2 != null) {
//            mergedList.insert(runner2.data);
//            runner2 = runner2.next;
//        }
//
//        return mergedList;
//    }
//}
//
//public class MergeLinkedLists {
//    public static void main(String[] args) {
//        LinkedList list1 = new LinkedList();
//        LinkedList list2 = new LinkedList();
//
//        // Inserting elements into the first linked list
//        list1.insert(1);
//        list1.insert(3);
//        list1.insert(5);
//
//        // Inserting elements into the second linked list
//        list2.insert(2);
//        list2.insert(4);
//        list2.insert(6);
//
//        System.out.println("List 1:");
//        list1.display();
//
//        System.out.println("List 2:");
//        list2.display();
//
//        // Merging the two linked lists
//        LinkedList mergedList = LinkedList.merge(list1, list2);
//        System.out.println("Merged List:");
//        mergedList.display();
//    }
//}