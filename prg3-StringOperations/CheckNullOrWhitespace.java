/*
 3b_1-->. Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty().
*/
package prg3a;
import java.util.*;
public class CheckNullOrWhitespace {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Taking input from user
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        // Calling the user-defined function
	        if (isNullOrEmpty(input)) {
	            System.out.println("The string is null or contains only whitespace.");
	        } else {
	            System.out.println("The string is valid: '" + input + "'");
	        }

	        sc.close();
	    }

	    // User-defined function to check for null or whitespace-only
	    public static boolean isNullOrEmpty(String str) {
	        return str == null || str.trim().isEmpty();
	    }
	}
