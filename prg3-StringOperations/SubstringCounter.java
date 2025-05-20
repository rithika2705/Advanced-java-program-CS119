/*
 3b_2--> Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()
 */
package prg3a;
import java.util.*;
public class SubstringCounter {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Getting main string from user
	        System.out.print("Enter the main string: ");
	        String mainStr = sc.nextLine();

	        // Getting substring from user
	        System.out.print("Enter the substring to search: ");
	        String subStr = sc.nextLine();

	        // Calling the user-defined function
	        int count = countOccurrences(mainStr, subStr);
	        System.out.println("The substring '" + subStr + "' appears " + count + " time(s) in the main string.");

	        sc.close();
	    }

	    // User-defined function to count occurrences of a substring
	    public static int countOccurrences(String main, String sub) {
	        int count = 0;
	        int index = 0;

	        while ((index = main.indexOf(sub, index)) != -1) {
	            count++;
	            index = index + sub.length(); 
	        }

	        return count;
	    }
	}



