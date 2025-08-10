/* Write a JAVA program to perform Autoboxing and also implement different methods of wrapper class.

package stringexample;
public class WrapperClassDemo {
    public static void main(String[] args) {

        // 1. Autoboxing: primitive to wrapper object
        int num = 50;
        Integer obj = num;  // autoboxing happens here
        System.out.println("Primitive value: " + num);
        System.out.println("Wrapper object (Autoboxed): " + obj);

        // 2. Wrapper class methods (using Integer class)

        // a. Convert string to Integer
        String str = "123";
        Integer fromString = Integer.parseInt(str);
        System.out.println("Converted from String: " + fromString);

        // b. Get binary, octal, and hex representations
        System.out.println("Binary of 50: " + Integer.toBinaryString(num));
        System.out.println("Octal of 50: " + Integer.toOctalString(num));
        System.out.println("Hex of 50: " + Integer.toHexString(num));

        // c. Compare two Integer values
        Integer a = 30;
        Integer b = 45;
        System.out.println("Comparison (a vs b): " + a.compareTo(b)); // will return negative value

        // d. ValueOf() method
        Integer val = Integer.valueOf("100");
        System.out.println("Integer value from valueOf(): " + val);

        // e. Max and Min constants
        System.out.println("Integer MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer MIN_VALUE: " + Integer.MIN_VALUE);
    }
}
*/