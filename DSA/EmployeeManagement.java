//package Lab08;
//import java.util.Scanner;
//
//class Employee {
//    String name, designation, department, company;
//    Employee next;
//
//    Employee(String name, String designation, String department, String company) {
//        this.name = name; this.designation = designation; this.department = department; this.company = company;
//    }
//}
//
//class EmployeeLinkedList {
//    private Employee head;
//
//    void insertFirst(String name, String designation, String department, String company) {
//        Employee newEmp = new Employee(name, designation, department, company);
//        newEmp.next = head; head = newEmp;
//    }
//
//    void insertLast(String name, String designation, String department, String company) {
//        Employee newEmp = new Employee(name, designation, department, company);
//        if (head == null) { head = newEmp; return; }
//        Employee current = head;
//        while (current.next != null) current = current.next;
//        current.next = newEmp;
//    }
//
//    void insertAtPosition(int position, String name, String designation, String department, String company) {
//        if (position == 0) { insertFirst(name, designation, department, company); return; }
//        Employee newEmp = new Employee(name, designation, department, company);
//        Employee current = head;
//        for (int i = 0; i < position - 1 && current != null; i++) current = current.next;
//        if (current == null) return;
//        newEmp.next = current.next; current.next = newEmp;
//    }
//
//    void searchByName(String name) {
//        Employee current = head;
//        while (current != null) {
//            if (current.name.equalsIgnoreCase(name)) {
//                System.out.println("Found: " + current.name + ", " + current.designation + ", " + current.department + ", " + current.company);
//                return;
//            }
//            current = current.next;
//        }
//        System.out.println("Not found.");
//    }
//
//    void display() {
//        Employee current = head;
//        while (current != null) {
//            System.out.println(current.name + ", " + current.designation + ", " + current.department + ", " + current.company);
//            current = current.next;
//        }
//    }
//}
//
//public class EmployeeManagement {
//    public static void main(String[] args) {
//        EmployeeLinkedList list = new EmployeeLinkedList();
//        Scanner scanner = new Scanner(System.in);
//
//        list.insertFirst("John Doe", "Developer", "IT", "Tech Solutions");
//        list.insertLast("Jane Smith", "Manager", "HR", "Tech Solutions");
//        list.insertAtPosition(1, "Alice Johnson", "Analyst", "Finance", "Tech Solutions");
//
//        list.display();
//
//        System.out.print("Enter employee name to search: ");
//        list.searchByName(scanner.nextLine());
//        scanner.close();
//    }
//}