/* 2. Write a java program for getting different colors through ArrayList interface and remove the 2nd element
 and color "Blue" from the ArrayList */
package prg_1b_2;
import java.util.*;


public class ColorRemove {
	    public static void main(String[] args) {

	        // Creating ArrayList 'a' to store colors
	        ArrayList<String> a = new ArrayList<>();

	        // 1. Adding different colors
	        a.add("Red");
	        a.add("Green");
	        a.add("Blue");
	        a.add("Yellow");
	        a.add("Black");

	        System.out.println(" colors in ArrayList a: " + a);

	        // 2. Removing the 2nd element (index 1)
	        if (a.size() > 1) {
	            a.remove(1); // removes "Green"
	            System.out.println("After removing 2nd element (index 1): " + a);
	        } else {
	            System.out.println("List doesn't have enough elements to remove the 2nd one.");
	        }

	        // 3. Removing color "Blue"
	        if (a.remove("Blue")) {
	            System.out.println("After removing color 'Blue': " + a);
	        } else {
	            System.out.println("Color 'Blue' not found in the list.");
	        }

	        // 4. Display final list
	        System.out.println("colors in ArrayList a: " + a);
	    }
	}

