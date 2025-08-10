/* Write a program to convert primitive data type Double into its respective wrapper object.

package stringexample;
public class DoubleToWrapper {
    public static void main(String[] args) {
        // Primitive double value
        double primitiveDouble = 25.75;

        // Convert primitive to wrapper (Boxing)
        Double wrapperDouble = Double.valueOf(primitiveDouble);

        // Display the values
        System.out.println("Primitive double value: " + primitiveDouble);
        System.out.println("Wrapper Double object: " + wrapperDouble);
    }
}
*/