/*
Step# 03:
package vectorexample;
import java.util.*;
public class EmployeeSorting {
    public static void main(String[] args) {
        // Creating ArrayList of Employees
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101, "Ali", "Male", 2022));
        empList.add(new Employee(102, "Fatima", "Female", 2020));
        empList.add(new Employee(103, "Ahmed", "Male", 2021));
        empList.add(new Employee(104, "Zainab", "Female", 2023));

        System.out.println("Before Sorting:");
        for (Employee e : empList) {
            System.out.println(e);
        }

        // Sorting using Comparable
        Collections.sort(empList);

        System.out.println("\nAfter Sorting by Year (using Comparable):");
        for (Employee e : empList) {
            System.out.println(e);
        }

        // Optional: Sorting using Comparator
        // Collections.sort(empList, new JoiningYearComparator());
        // System.out.println("\nAfter Sorting (using Comparator):");
        // for (Employee e : empList) {
        //     System.out.println(e);
        // }
}   
}
*/