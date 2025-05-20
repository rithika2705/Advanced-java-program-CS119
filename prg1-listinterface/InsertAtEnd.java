/*
Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))*/
package prg_1c_3;
import java.util.*;
public class InsertAtEnd {
	    public static void main(String[] args) {

	        // Creating LinkedList 'l' and adding some colors
	        LinkedList<String> l = new LinkedList<>();
	        l.add("Red");
	        l.add("Green");
	        l.add("Blue");

	        // Displaying original LinkedList
	        System.out.println("Original LinkedList l: " + l);

	        // Inserting "Pink" at the end using offerLast()
	        l.offerLast("Pink");

	        // Displaying updated LinkedList
	        System.out.println("After inserting 'Pink' at the end: " + l);
	    }
	}

