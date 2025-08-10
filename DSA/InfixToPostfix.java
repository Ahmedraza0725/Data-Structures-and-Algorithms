//package LAB09;
//import java.util.LinkedList;
//class Node {
//    char data;
//    Node next;
//    Node(char data) {
//        this.data = data; }}
//class Stack {
//    private Node top;
//    public void push(char data) {
//        Node newNode = new Node(data);
//        newNode.next = top;
//        top = newNode; }
//    public Character pop() {
//        if (top == null) return null;
//        char data = top.data;
//        top = top.next;
//        return data; }
//    public Character peek() {
//        return top == null ? null : top.data; }
//    public boolean isEmpty() {
//        return top == null; }}
//public class InfixToPostfix {
//    static int precedence(char ch) {
//        switch (ch) {
//            case '+':
//            case '-':
//                return 1;
//            case '*':
//            case '/':
//                return 2;
//            case '^':
//                return 3; }
//        return -1; }
//    static String infixToPostfix(String expression) {
//        StringBuilder result = new StringBuilder();
//        Stack stack = new Stack();
//        for (int i = 0; i < expression.length(); i++) {
//            char c = expression.charAt(i);
//            if (Character.isLetterOrDigit(c)) {
//                result.append(c); }
//            else if (c == '(') {
//                stack.push(c); }
//            else if (c == ')') {
//                while (stack.peek() != null && stack.peek() != '(') {
//                    result.append(stack.pop()); }
//                if (stack.peek() != null && stack.peek() != '(')
//                    return "Invalid Expression"; // invalid expression
//                else
//                    stack.pop();
//            } else{
//                while (stack.peek() != null && precedence(c) <= precedence(stack.peek())) {
//                    result.append(stack.pop()); }
//                stack.push(c); }}
//        while (stack.peek() != null) {
//            result.append(stack.pop()); }
//        return result.toString(); }
//    public static void main(String[] args) {
//        String expression = "A+(B*C-(D/E)^F)*G)*H";
//        System.out.println("Infix Expression: " + expression);
//        System.out.println("Postfix Expression: " + infixToPostfix(expression)); }} 