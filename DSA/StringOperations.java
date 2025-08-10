/*  Write a program that initialize five different strings and perform the following operations.
a. Concatenate all five stings. 
b. Convert fourth string to uppercase.
c. Find the substring from the concatenated string from 8 to onward.


package stringexample;
public class StringOperations {
    public static void main(String[] args) {

        // Step 1: Initialize five different strings
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Java";
        String str4 = "Programming";
        String str5 = "Language";

        // a. Concatenate all five strings
        String concatenated = str1 + str2 + str3 + str4 + str5;
        System.out.println("Concatenated String: " + concatenated);

        // b. Convert fourth string to uppercase
        String upperStr4 = str4.toUpperCase();
        System.out.println("Fourth String in Uppercase: " + upperStr4);

        // c. Find the substring from index 8 to the end
        if (concatenated.length() >= 8) {
            String substring = concatenated.substring(8);
            System.out.println("Substring from index 8 onward: " + substring);
        } else {
            System.out.println("Concatenated string is less than 8 characters long.");
        }
    }
}
*/
