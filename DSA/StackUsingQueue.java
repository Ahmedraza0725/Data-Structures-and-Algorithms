//package Lab11;
//import java.util.LinkedList;
//import java.util.Queue;
//public class StackUsingQueue {
//    private Queue<Integer> q1 = new LinkedList<>();
//    private Queue<Integer> q2 = new LinkedList<>();
//    public void push(int data) {
//        while (!q1.isEmpty()) {
//            q2.offer(q1.poll()); }
//        q1.offer(data);
//        while (!q2.isEmpty()) {
//            q1.offer(q2.poll()); }}
//    public Integer pop() {
//        if (q1.isEmpty()) {
//            return null;  }
//        return q1.poll(); }
//    public Integer peek() {
//        if (q1.isEmpty()) {
//            return null; }
//        return q1.peek(); }
//    public boolean isEmpty() {
//        return q1.isEmpty(); }
//    public int size() {
//        return q1.size(); }
//    public static void main(String[] args) {
//        StackUsingQueue stack = new StackUsingQueue();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        System.out.println("Stack size: " + stack.size());
//        System.out.println("Top element: " + stack.peek());
//        System.out.println("Popped: " + stack.pop());
//        System.out.println("Popped: " + stack.pop());
//        System.out.println("Stack size after pops: " + stack.size());
//        System.out.println("Is stack empty? " + stack.isEmpty());
//        System.out.println("Popped: " + stack.pop());
//        System.out.println("Is stack empty now? " + stack.isEmpty());
//        System.out.println("Trying to peek when empty: " + stack.peek());  }}