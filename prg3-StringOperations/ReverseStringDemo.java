/*
 Q3b_3-->. Write a Java Program for Reversing the characters in a string using user defined function
reverseString().
 */
package prg3a;
import java.util.*;
public class ReverseStringDemo {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Taking input from user
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        // Calling the user-defined function to reverse
	        String reversed = reverseString(input);
	        System.out.println("Reversed string: " + reversed);

	        sc.close();
	    }

	    // User-defined function to reverse a string
	    public static String reverseString(String str) {
	        StringBuilder sb = new StringBuilder(str);
	        return sb.reverse().toString();
	    }
	}
