/*1c_1-->Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
*/
package prg_1c_1;
import java.util.*;
public class IteratorFromSecondPosition {
	    public static void main(String[] args) {

	        // Creating LinkedList 'l' and adding colors
	        LinkedList<String> l = new LinkedList<>();
	        l.add("Red");
	        l.add("Green");
	        l.add("Blue");
	        l.add("Yellow");
	        l.add("Black");

	        // Display original LinkedList
	        System.out.println("Original LinkedList l: " + l);

	        // Create an iterator starting from the 2nd element (index 1)
	        Iterator<String> it = l.listIterator(1);

	        // Iterate and print elements from 2nd position
	        System.out.print("Iterating from 2nd element: ");
	        while (it.hasNext()) {
	            System.out.print(it.next() + " ");
	        }
	    }
	}

