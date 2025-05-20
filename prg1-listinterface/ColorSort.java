/* 3. Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)
 */
package prg_1b_3;
import java.util.*;
public class ColorSort {
	    public static void main(String[] args) {

	        // 1. Creating ArrayList 'a' to store colors
	        ArrayList<String> a = new ArrayList<>();

	        // 2. Adding colors to the list
	        a.add("Blue");
	        a.add("Red");
	        a.add("Green");
	        a.add("Yellow");
	        a.add("Black");

	        // 3. Displaying original list
	        System.out.println("Original colors in ArrayList: " + a);

	        // 4. Sorting using Collections.sort()
	        Collections.sort(a);

	        // 5. Displaying sorted list
	        System.out.println("Sorted colors in ArrayLis: " + a);
	    }
	}


