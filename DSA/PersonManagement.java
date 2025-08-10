//package Lab07;
//import java.util.Scanner;
//
//class Person {
//    String name;
//    int age;
//    double salary;
//    Person next;
//
//    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//        this.next = null;
//    }
//}
//
//class PersonLinkedList {
//    private Person head;
//
//    // Method to insert a person at a specific position
//    public void insert(int position, String name, int age, double salary) {
//        Person newPerson = new Person(name, age, salary);
//        if (position == 0) {
//            newPerson.next = head;
//            head = newPerson;
//            return;
//        }
//
//        Person current = head;
//        for (int i = 0; i < position - 1 && current != null; i++) {
//            current = current.next;
//        }
//
//        if (current == null) {
//            System.out.println("Position out of bounds.");
//            return;
//        }
//
//        newPerson.next = current.next;
//        current.next = newPerson;
//    }
//
//    // Method to delete a person by name
//    public void delete(String name) {
//        if (head == null) {
//            System.out.println("The list is empty.");
//            return;
//        }
//
//        if (head.name.equals(name)) {
//            head = head.next;
//            return;
//        }
//
//        Person current = head;
//        while (current.next != null && !current.next.name.equals(name)) {
//            current = current.next;
//        }
//
//        if (current.next == null) {
//            System.out.println("Person with name " + name + " not found.");
//            return;
//        }
//
//        current.next = current.next.next;
//    }
//
//    // Method to view the list
//    public void viewList() {
//        if (head == null) {
//            System.out.println("The list is empty.");
//            return;
//        }
//        Person current = head;
//        while (current != null) {
//            System.out.println("Name: " + current.name + ", Age: " + current.age + ", Salary: " + current.salary);
//            current = current.next;
//        }
//    }
//}
//
//public class PersonManagement {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        PersonLinkedList personList = new PersonLinkedList();
//
//        // Read details of 10 persons
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Enter name of person " + (i + 1) + ": ");
//            String name = scanner.nextLine();
//            System.out.print("Enter age of person " + (i + 1) + ": ");
//            int age = scanner.nextInt();
//            System.out.print("Enter salary of person " + (i + 1) + ": ");
//            double salary = scanner.nextDouble();
//            scanner.nextLine(); // Consume newline
//
//            // Insert at the end of the list
//            personList.insert(i, name, age, salary);
//        }
//
//        // View the list
//        System.out.println("\nCurrent List of Persons:");
//        personList.viewList();
//
//        // Delete a record
//        System.out.print("\nEnter the name of the person to delete: ");
//        String nameToDelete = scanner.nextLine();
//        personList.delete(nameToDelete);
//
//        // View the list after deletion
//        System.out.println("\nList of Persons after deletion:");
//        personList.viewList();
//
//        scanner.close();
//    }
//}
