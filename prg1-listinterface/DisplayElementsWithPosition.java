/*
 1c_4--->Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )
 */
package prg_1c_4; 
import java.util.*;
public class DisplayElementsWithPosition {
	    public static void main(String[] args) {

	        // Creating LinkedList 'l' and adding some colors
	        LinkedList<String> l = new LinkedList<>();
	        l.add("Red");
	        l.add("Green");
	        l.add("Blue");
	        l.add("Yellow");
	        l.add("Black");

	        // Displaying elements with their positions
	        System.out.println("Elements and their positions in LinkedList l:");
	        for (int p = 0; p < l.size(); p++) {
	            System.out.println("Position " + p + ": " + l.get(p));
	        }
	    }
	}
