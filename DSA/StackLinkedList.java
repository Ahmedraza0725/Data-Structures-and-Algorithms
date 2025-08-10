//package LAB09;
//class Node {
//    int data;
//    Node next;
//    Node(int data) {
//        this.data = data; }}
//class Stack {
//    private Node top;
//    public void push(int data) {
//        Node newNode = new Node(data);
//        newNode.next = top;
//        top = newNode; }
//    public Integer pop() {
//        if (top == null) return null;
//        int data = top.data;
//        top = top.next;
//        return data; }
//    public Integer peek() {
//        return top == null ? null : top.data; }
//    public boolean isEmpty() {
//        return top == null; }}
//public class StackLinkedList {
//    public static void main(String[] args) {
//        Stack stack = new Stack();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        System.out.println("Peek: " + stack.peek());
//        System.out.println("Pop: " + stack.pop());
//        System.out.println("Peek: " + stack.peek());
//        System.out.println("Is empty: " + stack.isEmpty()); }}