/*3c-->
 Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()
 */
package prg3a;
import java.util.*;
public class ShorteningAString {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Taking original string from user
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        // Taking max length from user
	        System.out.print("Enter the maximum length: ");
	        int maxLength = sc.nextInt();

	        // Calling user-defined function
	        String result = truncate(input, maxLength);
	        System.out.println("Truncated string: " + result);

	        sc.close();
	    }

	    // User-defined function to truncate a string and add ellipsis
	    public static String truncate(String str, int maxLength) {
	        if (str == null || str.length() <= maxLength) {
	            return str;
	        }
	        if (maxLength <= 3) {
	            return "...".substring(0, maxLength); // In case maxLength is very small
	        }
	        return str.substring(0, maxLength - 3) + "...";
	    }
	}
