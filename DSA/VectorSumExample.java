/*Write a program that initializes Vector with 10 integers in it. Display all the integers 
and sum of these integers. 

package vectorexample;
import java.util.Vector;

public class VectorSumExample {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        int sum = 0;

        // Initializing vector with 10 integers
        for (int i = 1; i <= 10; i++) {
            numbers.add(i * 2); // You can change the values as needed
        }

        System.out.println("Vector Elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
            sum += num;
        }

        System.out.println("\nSum of elements: " + sum);
    }
}
*/