/*
 Q3b_5-->. Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()
 */
package prg3a;
import java.util.*; 

public class RemoveWhitespaceDemo {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Taking input from user
	        System.out.print("Enter a string with spaces: ");
	        String input = sc.nextLine();

	        // Calling user-defined function to remove whitespace
	        String result = removeWhitespace(input);
	        System.out.println("String after removing whitespace: " + result);

	        sc.close();
	    }

	    // User-defined function to remove all whitespace characters
	    public static String removeWhitespace(String str) {
	        return str.replaceAll("\\s+", "");
	    }
	}

