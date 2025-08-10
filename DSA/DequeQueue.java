//package Lab11;
//import java.util.ArrayDeque;
//import java.util.Deque;
//
//public class DequeQueue {
//    public static void main(String[] args) {
//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.offerLast(10);
//        deque.offerLast(20);
//        deque.offerLast(30);
//        System.out.println("Deque: " + deque);
//        int front = deque.pollFirst();
//        System.out.println("Removed from front: " + front);
//        System.out.println("Deque after removing from front: " + deque);
//        deque.offerFirst(5);
//        System.out.println("Deque after adding to front: " + deque);
//        int rear = deque.pollLast();
//        System.out.println("Removed from rear: " + rear);
//        System.out.println("Deque after removing from rear: " + deque);
//        System.out.println("Front element: " + deque.peekFirst());
//        System.out.println("Rear element: " + deque.peekLast());
//        System.out.println("Is deque empty? " + deque.isEmpty());
//    }
//}