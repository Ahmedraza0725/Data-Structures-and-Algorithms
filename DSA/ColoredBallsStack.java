//package LAB09;
//import java.util.Scanner;
//
//class Stack {
//    private String[] balls;
//    private int top;
//
//    public Stack(int capacity) {
//        balls = new String[capacity];
//        top = -1;
//    }
//
//    public void push(String ball) {
//        if (top < balls.length - 1) {
//            balls[++top] = ball;
//        }
//    }
//
//    public String pop() {
//        if (top >= 0) {
//            return balls[top--];
//        }
//        return null;
//    }
//
//    public void printStack() {
//        for (int i = top; i >= 0; i--) {
//            System.out.print(balls[i] + "->");
//        }
//        System.out.println("null");
//    }
//}
//
//public class ColoredBallsStack {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Stack stack = new Stack(10);
//
//        System.out.println("Enter the number of balls:");
//        int n = scanner.nextInt();
//        scanner.nextLine(); // Consume newline left-over
//
//        System.out.println("Enter the colors of the balls (red, yellow, orange, green):");
//        for (int i = 0; i < n; i++) {
//            String color = scanner.nextLine();
//            stack.push(color);
//        }
//
//        System.out.println("Original Stack:");
//        stack.printStack();
//
//        System.out.println("Enter the color to remove:");
//        String removeColor = scanner.nextLine();
//
//        Stack tempStack = new Stack(10);
//        while (true) {
//            String ball = stack.pop();
//            if (ball == null) break;
//            if (!ball.equals(removeColor)) {
//                tempStack.push(ball);
//            }
//        }
//
//        while (true) {
//            String ball = tempStack.pop();
//            if (ball == null) break;
//            stack.push(ball);
//        }
//
//        System.out.println("Updated Stack:");
//        stack.printStack();
//
//        scanner.close();
//    }
//}
