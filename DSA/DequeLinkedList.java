//package Lab08;
//import java.util.Deque;
//import java.util.LinkedList;
//
//public class DequeLinkedList {
//    public static void main(String[] args) {
//        Deque<Integer> deque = new LinkedList<>();
//
//        // 1. Add elements to the front and back
//        deque.addFirst(10);
//        deque.addLast(20);
//        deque.addFirst(5);
//        deque.addLast(25);
//        
//        System.out.println("Deque after additions: " + deque);
//
//        // 2. Remove the first element
//        int removedFirst = deque.removeFirst();
//        System.out.println("Removed first element: " + removedFirst);
//        System.out.println("Deque after removing first: " + deque);
//
//        // 3. Remove the last element
//        int removedLast = deque.removeLast();
//        System.out.println("Removed last element: " + removedLast);
//        System.out.println("Deque after removing last: " + deque);
//
//        // 4. Peek at the first element
//        int firstElement = deque.peekFirst();
//        System.out.println("First element (peek): " + firstElement);
//
//        // 5. Peek at the last element
//        int lastElement = deque.peekLast();
//        System.out.println("Last element (peek): " + lastElement);
//    }
//}