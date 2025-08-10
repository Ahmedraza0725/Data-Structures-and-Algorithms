//2.	Write a function called occurrences that, given an array of numbers A, prints all the distinct values in A each followed by its number of occurrences. 
//For example, if A = (28, 1, 0, 1, 0, 3, 4, 0, 0, 3), the function should output the following five lines (here separated by a semicolon) “28 1; 1 2; 0 4; 3 2; 4 1”.
//
//
//package Lab06;
//import java.util.HashMap;
//import java.util.Map;
//
//public class HomeTask2 {
//    public static void main(String[] args) {
//        int[] A = {28, 1, 0, 1, 0, 3, 4, 0, 0, 3};
//        occurrences(A);
//    }
//
//    public static void occurrences(int[] A) {
//        Map<Integer, Integer> frequencyMap = new HashMap<>();
//
//        for (int num : A) {
//            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//        }
//
//        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//    }
//}