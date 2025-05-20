/* 4. Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()
 */
package prg_1b_4;
import java.util.*;
public class ColorExtract {
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
	        System.out.println(" colors in ArrayList a: " + a);
	        // Extracting 1st and 2nd elements using subList()
	        List<String> sub = a.subList(0, 2); // index 0 to 2 (exclusive)
	        System.out.println("Sublist with 1st and 2nd elements: " + sub);
	    }
	}
