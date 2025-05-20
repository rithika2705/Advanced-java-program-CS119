/* 5. Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index  */
package prg_1b_5;
import java.util.*;
public class ColorDelete {
	    public static void main(String[] args) {

	        // Creating ArrayList 'a' to store colors
	        ArrayList<String> a = new ArrayList<>();

	        // Adding colors
	        a.add("Red");
	        a.add("Green");
	        a.add("Blue");
	        a.add("Yellow");
	        a.add("Black");

	        // Displaying original list
	        System.out.println("Original colors in ArrayList a: " + a);

	        // Deleting the n-th element (example: 3rd element, which is at index 2)
	        int n = 3;  // n-th position to delete (1-based index)
	        int index = n - 1;  // converting to 0-based index

	        // Removing by index
	        a.remove(index);

	        // Displaying list after deletion
	        System.out.println("After deleting " + n + "rd element:");
	        System.out.println("Colors in ArrayList a: " + a);
	    }
	}
