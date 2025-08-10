//package LAB09;
//class Stack {
//    private int[] stackArray;
//    private int top;
//    private int capacity;
//    public Stack(int capacity) {
//        this.capacity = capacity;
//        this.stackArray = new int[capacity];
//        this.top = -1; }
//    public boolean isFull() {
//        return top == capacity - 1; }
//    public boolean isEmpty() {
//        return top == -1; }
//    public void push(int data) {
//        if (isFull()) {
//            System.out.println("Stack is full. Cannot push element.");
//            return; }
//        stackArray[++top] = data;
//        System.out.println(data + " pushed to stack"); }
//    public Integer pop() {
//        if (isEmpty()) {
//            System.out.println("Stack is empty. Cannot pop element.");
//            return null; }
//        return stackArray[top--]; }
//    public Integer peek() {
//        if (isEmpty()) {
//            System.out.println("Stack is empty. No element to peek.");
//            return null; }
//        return stackArray[top]; }
//    public int size() {
//        return top + 1; }
//    public void printStack() {
//        if (isEmpty()) {
//            System.out.println("Stack is empty.");
//            return; }
//        System.out.print("Stack: ");
//        for (int i = 0; i <= top; i++) {
//            System.out.print(stackArray[i] + " "); }
//        System.out.println(); }}
//public class StackOperations {
//    public static void main(String[] args) {
//        Stack stack = new Stack(10);
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(50);
//        System.out.println("Stack size: " + stack.size());
//        System.out.println("Top element: " + stack.peek());
//        stack.printStack();
//        System.out.println("Popped: " + stack.pop());
//        System.out.println("Popped: " + stack.pop());
//        System.out.println("Stack size after pops: " + stack.size());
//        stack.printStack(); }} 