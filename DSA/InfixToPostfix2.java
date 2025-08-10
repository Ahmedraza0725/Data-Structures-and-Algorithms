//package LAB10;
//interface StackADT {
//    void push(char item);
//    Character pop();
//    Character peek();
//    boolean isEmpty();
//}
//
//class Stack implements StackADT {
//    private char[] stackArray;
//    private int top;
//    private int capacity;
//
//    public Stack(int capacity) {
//        this.capacity = capacity;
//        this.stackArray = new char[capacity];
//        this.top = -1;
//    }
//
//    public void push(char item) {
//        if (top == capacity - 1) {
//            System.out.println("Stack Overflow!");
//            return;
//        }
//        stackArray[++top] = item;
//    }
//
//    public Character pop() {
//        if (isEmpty()) {
//            System.out.println("Stack Underflow!");
//            return null;
//        }
//        return stackArray[top--];
//    }
//
//    public Character peek() {
//        if (isEmpty()) {
//            return null;
//        }
//        return stackArray[top];
//    }
//
//    public boolean isEmpty() {
//        return top == -1;
//    }
//}
//
//public class InfixToPostfix {
//
//    static int precedence(char ch) {
//        switch (ch) {
//            case '+':
//            case '-':
//                return 1;
//            case '*':
//            case '/':
//                return 2;
//            case '|': //bitwise OR
//                return 3;
//            case '^':
//                return 4;
//        }
//        return -1;
//    }
//
//    static String infixToPostfix(String expression) {
//        StringBuilder result = new StringBuilder();
//        Stack stack = new Stack(expression.length());
//
//        for (int i = 0; i < expression.length(); i++) {
//            char c = expression.charAt(i);
//
//            if (Character.isLetterOrDigit(c)) {
//                result.append(c);
//            } else if (c == '(') {
//                stack.push(c);
//            } else if (c == ')') {
//                while (stack.peek() != null && stack.peek() != '(') {
//                    result.append(stack.pop());
//                }
//                if (stack.peek() != null && stack.peek() == '(') {
//                    stack.pop();
//                }
//            } else {
//                while (stack.peek() != null && precedence(c) <= precedence(stack.peek())) {
//                    result.append(stack.pop());
//                }
//                stack.push(c);
//            }
//        }
//
//        while (stack.peek() != null) {
//            result.append(stack.pop());
//        }
//
//        return result.toString();
//    }
//
//    static int evaluatePostfix(String expression, int a, int b, int c, int d, int e, int f, int g, int h) {
//        Stack stack = new Stack(expression.length());
//
//        for (int i = 0; i < expression.length(); i++) {
//            char c = expression.charAt(i);
//
//            if (Character.isLetter(c)) {
//                int value = 0;
//                switch (c) {
//                    case 'A': value = a; break;
//                    case 'B': value = b; break;
//                    case 'C': value = c; break;
//                    case 'D': value = d; break;
//                    case 'E': value = e; break;
//                    case 'F': value = f; break;
//                    case 'G': value = g; break;
//                    case 'H': value = h; break;
//                }
//                stack.push((char)(value + '0'));
//            } else if (Character.isDigit(c)) {
//                stack.push(c);
//            } else {
//                int operand2 = stack.pop() - '0';
//                int operand1 = stack.pop() - '0';
//                int result = 0;
//                switch (c) {
//                    case '+': result = operand1 + operand2; break;
//                    case '-': result = operand1 - operand2; break;
//                    case '*': result = operand1 * operand2; break;
//                    case '/': result = operand1 / operand2; break;
//                    case '|': result = operand1 | operand2; break; //bitwise OR
//                }
//                stack.push((char)(result + '0'));
//            }
//        }
//
//        return stack.pop() - '0';
//    }
//
//    public static void main(String[] args) {
//        String infixExpression = "A + ( B * C - ( D / E | F ) * G ) * H";
//        String cleanedInfix = infixExpression.replaceAll("\\s+", ""); // Remove spaces
//        String postfixExpression = infixToPostfix(cleanedInfix);
//
//        System.out.println("Infix Expression: " + infixExpression);
//        System.out.println("Postfix Expression: " + postfixExpression);
//
//        int a = 1, b = 2, c = 3, d = 4, e = 2, f = 1, g = 2, h = 1;
//        int result = evaluatePostfix(postfixExpression, a, b, c, d, e, f, g, h);
//        System.out.println("Result: " + result);
//    }
//}
