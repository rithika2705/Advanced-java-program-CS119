/*
 1c_5-->.Write a Java program that swaps two elements ( first and third elements ) in a linked list
 */
package prg_1c_5;
import java.util.*;
public class SwapElements {
	    public static void main(String[] args) {

	        // Creating LinkedList 'l' and adding colors
	        LinkedList<String> l = new LinkedList<>();
	        l.add("Red");   
	        l.add("Green");  
	        l.add("Blue");    
	        l.add("Yellow");  
	        l.add("Black");

	        // Display original list
	        System.out.println("Original LinkedList l: " + l);

	        // Swapping first (index 0) and third (index 2) elements
	        Collections.swap(l, 0, 2);

	        // Display list after swapping
	        System.out.println("After swapping 1st and 3rd elements: " + l);
	    }
	}

