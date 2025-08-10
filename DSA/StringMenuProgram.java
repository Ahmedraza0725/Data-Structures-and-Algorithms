/* Create a ArrayList of string. Write a menu driven program which: 
a. Displays all the elements 
b. Displays the largest String 

package vectorexample;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringMenuProgram {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Sample data
        names.add("Ali");
        names.add("Zainab");
        names.add("Ahmed");
        names.add("Fatima");

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display all elements");
            System.out.println("2. Display the largest string");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("List of Strings:");
                    for (String s : names) {
                        System.out.println(s);
                    }
                    break;
                case 2:
                    String largest = "";
                    for (String s : names) {
                        if (s.length() > largest.length()) {
                            largest = s;
                        }
                    }
                    System.out.println("Largest String: " + largest);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);
        sc.close();
    }
}
*/