//package LAB09;
//import java.util.Arrays;
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
//        stackArray[++top] = data; }
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
//public class PostfixEvaluation {
//    public static int evaluatePostfix(String expression) {
//        Stack stack = new Stack(expression.length()); // Assuming enough capacity
//        for (String token : expression.split(" ")) {
//            if (isNumeric(token)) {
//                stack.push(Integer.parseInt(token));
//            } else {
//                int operand2 = stack.pop();
//                int operand1 = stack.pop();
//                int result = 0;
//                switch (token) {
//                    case "+":
//                        result = operand1 + operand2;
//                        break;
//                    case "-":
//                        result = operand1 - operand2;
//                        break;
//                    case "*":
//                        result = operand1 * operand2;
//                        break;
//                    case "/":
//                        result = operand1 / operand2;
//                        break;
//                    case "^":
//                        result = (int) Math.pow(operand1, operand2); // Use Math.pow for exponentiation
//                        break;
//                    default:
//                        System.out.println("Invalid operator: " + token);
//                        return 0; }
//                stack.push(result);}}
//        return stack.pop(); }
//    public static boolean isNumeric(String str) {
//        try {
//            Integer.parseInt(str);
//            return true;
//        } catch (NumberFormatException e) {
//            return false; }}
//    public static void main(String[] args) {
//        String postfixExpression = "2 3 1 * + 9 -";
//        int result = evaluatePostfix(postfixExpression);
//        System.out.println("Postfix Expression: " + postfixExpression);
//        System.out.println("Result: " + result); }}