package Lab11;
public class LinkedListQueue {
    private static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null; }}
    private Node front;
    private Node rear;
    private int size;
    public LinkedListQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0; }
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode; }
        size++; }
    public Integer dequeue() {
        if (isEmpty()) {
            return null;  }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;  }
        size--;
        return data; }
    public Integer peek() {
        if (isEmpty()) {
            return null; }
        return front.data; }
    public boolean isEmpty() {
        return size == 0;    }
    public int size() {
        return size; }
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Queue size: " + queue.size());
        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Queue size after dequeues: " + queue.size());
        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Is queue empty now? " + queue.isEmpty());
        System.out.println("Trying to peek when empty: " + queue.peek()); }}