/* 1c_2-->Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())*/
package prg_1c_2;
import java.util.*;
public class ReverseIterator {
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

	        // Using descendingIterator() to iterate in reverse order
	        Iterator<String> it = l.descendingIterator();

	        // Printing elements in reverse order
	        System.out.print("Iterating in reverse order: ");
	        while (it.hasNext()) {
	            System.out.print(it.next() + " ");
	        }
	    }
	}

