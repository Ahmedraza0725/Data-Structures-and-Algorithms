//package Lab11;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//public class GarageManagement {
//    private static final int GARAGE_CAPACITY = 10; 
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        LinkedList<String> garage = new LinkedList<>(); 
//        Queue<String> tempQueue = new LinkedList<>(); 
//        int[] moveCounts = new int[100];
//        while (scanner.hasNextLine()) {
//            String line = scanner.nextLine().trim();
//            if (line.isEmpty()) continue;
//            String[] parts = line.split("\\s+");
//            if (parts.length != 2) {
//                System.out.println("Invalid input format: " + line);
//                continue; }
//            char action = parts[0].charAt(0);
//            String licensePlate = parts[1];
//            switch (action) {
//                case 'A':
//                    if (garage.size() < GARAGE_CAPACITY) {
//                        garage.add(licensePlate);
//                        System.out.println("Car " + licensePlate + " arrived. Room available. Garage: " + garage);
//                    } else {
//                        System.out.println("Car " + licensePlate + " arrived. No room available. Car departed without entering."); }
//                    break;
//                case 'D':
//                    if (garage.contains(licensePlate)) {
//                        int moves = 0;
//                        while (!garage.getFirst().equals(licensePlate)) {
//                            String movedCar = garage.removeFirst();
//                            tempQueue.offer(movedCar);
//                            moveCounts[movedCar.hashCode() % 100]++; // Track moves, using hashcode as index
//                            moves++; }
//                        garage.removeFirst(); // Remove the departing car
//                        while (!tempQueue.isEmpty()) {
//                            garage.addFirst(tempQueue.poll()); }
//
// System.out.println("Car " + licensePlate + " departed. Moved " + moveCounts[licensePlate.hashCode() % 100] + " times. Garage: " + garage);
//                        moveCounts[licensePlate.hashCode() % 100] = 0; // Reset count for this car
//                    } else {
//                        System.out.println("Car " + licensePlate + " not found in garage."); }
//                    break;
//                default:
//                    System.out.println("Invalid action: " + action); }}}}