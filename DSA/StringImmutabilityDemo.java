/*2. Write a JAVA program that takes 3 strings and show that strings are immutable. 

package stringexample;
import java.util.Scanner;

public class StringImmutabilityDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take 3 string inputs from the user
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        System.out.print("Enter third string: ");
        String str3 = scanner.nextLine();

        // Show original strings
        System.out.println("\nOriginal Strings:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);

        // Try to modify the strings using concat()
        str1.concat(" Test");
        str2.toUpperCase();
        str3.replace('a', 'x');

        // Show strings after "modification"
        System.out.println("\nAfter trying to modify:");
        System.out.println("str1 (after concat): " + str1);
        System.out.println("str2 (after toUpperCase): " + str2);
        System.out.println("str3 (after replace): " + str3);

        // Explanation
        System.out.println("\nResult: Strings are immutable. The original values did not change.");

        scanner.close();
    }
}
*/