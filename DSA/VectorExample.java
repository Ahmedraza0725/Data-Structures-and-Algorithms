//1. Create a Vector storing integer objects as an input. a. Sort the vector b. Display largest number c. Display smallest number

/*package vectorexample;
import java.util.*;
public class VectorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> numbers = new Vector<>();

        // 1. Input: Store integers in a vector
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        // 2a. Sort the vector
        Collections.sort(numbers);

        // Display the sorted vector
        System.out.println("Sorted Vector: " + numbers);

        // 2b. Display largest number
        int largest = Collections.max(numbers);
        System.out.println("Largest number: " + largest);

        // 2c. Display smallest number
        int smallest = Collections.min(numbers);
        System.out.println("Smallest number: " + smallest);

        scanner.close();
    }
}
*/