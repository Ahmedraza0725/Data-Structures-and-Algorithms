//2.	Write a program to search in array using Array built-in class.
//
//
//package Lab06;
//import java.util.Arrays;
//
//public class LabTask2 {
//    public static void main(String[] args) {
//        int[] data = {3, 5, 7, 9, 11, 15, 18, 20};
//        Arrays.sort(data);  // Ensure array is sorted before binary search
//
//        int key = 11;
//        int index = Arrays.binarySearch(data, key);
//
//        if (index >= 0) {
//            System.out.println("Element " + key + " found at index: " + index);
//        } else {
//            System.out.println("Element " + key + " not found.");
//        }
//    }
//}