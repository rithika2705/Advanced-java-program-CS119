/*1. Write a java program for getting different colors through ArrayList interface and search whether color
 "Red" is available or not*/
package prg_1b_1;
import java.util.*;
public class ColorSearch {
	    public static void main(String[] args) {

	        // Creating ArrayList 'a' to store colors
	        ArrayList<String> a = new ArrayList<>();
	        // 1. Adding different colors
	        a.add("Blue");
	        a.add("Green");
	        a.add("Yellow");
	        a.add("Red");
	        a.add("Black");

	        // 2. Displaying all colors
	        System.out.println("Colors in the ArrayList a: " + a);

	        // 3. Searching for color "Red"
	        if (a.contains("Red")) {
	            System.out.println("The color Red is available.");
	        } else {
	            System.out.println("The color Red is NOT available t.");
	        }
	    }
	}





