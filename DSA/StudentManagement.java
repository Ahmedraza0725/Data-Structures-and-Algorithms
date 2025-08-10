//package Lab08;
//import java.util.Deque;
//import java.util.LinkedList;
//import java.util.Scanner;
//
//class Student {
//    String name, major;
//    Student prev, next;
//
//    Student(String name, String major) {
//        this.name = name; this.major = major;
//    }
//}
//
//public class StudentManagement {
//    private Deque<Student> deque = new LinkedList<>();
//
//    void insertFirst(String name, String major) {
//        deque.addFirst(new Student(name, major));
//    }
//
//    void insertLast(String name, String major) {
//        deque.addLast(new Student(name, major));
//    }
//
//    void display() {
//        for (Student s : deque) System.out.println(s.name + ", " + s.major);
//    }
//
//    public static void main(String[] args) {
//        StudentManagement sm = new StudentManagement();
//        Scanner scanner = new Scanner(System.in);
//
//        sm.insertFirst("Alice", "Computer Science");
//        sm.insertLast("Bob", "Mathematics");
//
//        sm.display();
//
//        System.out.print("Enter student name to insert at first: ");
//        sm.insertFirst(scanner.nextLine(), "Unknown Major");
//        sm.display();
//
//        System.out.print("Enter student name to insert at last: ");
//        sm.insertLast(scanner.nextLine(), "Unknown Major");
//        sm.display();
//
//        scanner.close();
//    }
//}
