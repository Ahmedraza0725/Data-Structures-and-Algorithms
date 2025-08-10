/*Write a program that initialize five different strings using all the above mentioned ways,
i.e., a) string literals b) new keyword also use intern method and show string immutability.


package stringexample;
public class StringExample {
    public static void main(String[] args) {

        // a) Using string literals (stored in String Pool)
        String str1 = "Java";
        String str2 = "Java";

        // b) Using new keyword (stored in Heap, not in String Pool)
        String str3 = new String("Java");
        String str4 = new String("Java");

        // Another string using new keyword but different text
        String str5 = new String("Programming");

        // Display all strings
        System.out.println("str1 (literal): " + str1);
        System.out.println("str2 (literal): " + str2);
        System.out.println("str3 (new): " + str3);
        System.out.println("str4 (new): " + str4);
        System.out.println("str5 (new): " + str5);

        // Check references
        System.out.println("\nReference Comparisons:");
        System.out.println("str1 == str2: " + (str1 == str2)); // true (same object in String pool)
        System.out.println("str1 == str3: " + (str1 == str3)); // false (different memory)
        System.out.println("str3 == str4: " + (str3 == str4)); // false

        // Use intern method
        String str6 = str3.intern(); // returns reference from string pool
        System.out.println("str1 == str6 (after intern): " + (str1 == str6)); // true

        // Demonstrate String immutability
        System.out.println("\nBefore change, str1: " + str1);
        str1.concat(" Programming"); // This does NOT change str1
        System.out.println("After concat (not assigned), str1: " + str1);
        String newStr = str1.concat(" Programming"); // Now assigned to a new string
        System.out.println("New string after concat: " + newStr);
    }
}*/