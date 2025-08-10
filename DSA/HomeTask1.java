//1.	Write a program initializing array of size 20 and search an element using binary search.
//
//package Lab06;
//public class HomeTask1 {
//    public static void main(String[] args) {
//        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39};
//
//        int target = 25;
//        int result = binarySearch(arr, target);
//
//        if (result != -1) {
//            System.out.println("Element found at index: " + result);
//        } else {
//            System.out.println("Element not found.");
//        }
//    }
//
//    public static int binarySearch(int[] arr, int target) {
//        int left = 0, right = arr.length - 1;
//
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//
//            if (arr[mid] == target) return mid;
//            if (arr[mid] < target) left = mid + 1;
//            else right = mid - 1;
//        }
//
//        return -1;  // Not found
//    }
//}