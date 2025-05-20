/*Program 1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a LinkedList
 to perform the following operations with different functions directed as follows
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list*/
 
package prg_1a;
import java.util.*;
public class ListOperations {
	    public static void main(String[] args) {

	        // 1. Adding elements
	        ArrayList<String> a = new ArrayList<>();
	        LinkedList<String> l = new LinkedList<>();

	        a.add("Apple");
	        a.add("Banana");
	        a.add("Orange");

	        l.add("Apple");
	        l.add("Banana");
	        l.add("Orange");

	        System.out.println("1. Elements added:");
	        System.out.println("ArrayList a: " + a);
	        System.out.println("LinkedList l: " + l);

	        // 2. Adding element at specific index
	        a.add(1, "Grapes");
	        l.add(1, "Grapes");

	        System.out.println("\n2. After adding at index 1:");
	        System.out.println("ArrayList a: " + a);
	        System.out.println("LinkedList l: " + l);

	        // 3. Adding multiple elements
	        List<String> more = Arrays.asList("Pineapple", "Mango");
	        a.addAll(more);
	        l.addAll(more);

	        System.out.println("\n3. After adding multiple elements:");
	        System.out.println("ArrayList a: " + a);
	        System.out.println("LinkedList l: " + l);

	        // 4. Accessing elements
	        System.out.println("\n4. Accessing element at index 2:");
	        System.out.println("ArrayList a: " + a.get(2));
	        System.out.println("LinkedList l: " + l.get(2));

	        // 5. Updating elements
	        a.set(0, "Kiwi");
	        l.set(0, "Kiwi");

	        System.out.println("\n5. After updating element at index 0:");
	        System.out.println("ArrayList a: " + a);
	        System.out.println("LinkedList l: " + l);

	        // 6. Removing elements
	        a.remove("Banana");
	        l.remove("Banana");

	        System.out.println("\n6. After removing 'Banana':");
	        System.out.println("ArrayList a: " + a);
	        System.out.println("LinkedList l: " + l);

	        // 7. Searching elements
	        System.out.println("\n7. Searching for 'Mango':");
	        System.out.println("ArrayList a contains Mango? " + a.contains("Mango"));
	        System.out.println("LinkedList l contains Mango? " + l.contains("Mango"));

	        // 8. List size
	        System.out.println("\n8. Size of lists:");
	        System.out.println("ArrayList a size: " + a.size());
	        System.out.println("LinkedList l size: " + l.size());

	        // 9. Iterating over list using for-each
	        System.out.println("\n9. Iterating using for-each:");
	        System.out.print("ArrayList a: ");
	        for (String fruit : a) {
	            System.out.print(fruit + " ");
	        }

	        System.out.print("\nLinkedList l: ");
	        for (String fruit : l) {
	            System.out.print(fruit + " ");
	        }

	        // 10. Using Iterator
	        System.out.println("\n\n10. Iterating using Iterator:");
	        Iterator<String> ai = a.iterator();
	        System.out.print("ArrayList a: ");
	        while (ai.hasNext()) {
	            System.out.print(ai.next() + " ");
	        }

	        Iterator<String> li = l.iterator();
	        System.out.print("\nLinkedList l: ");
	        while (li.hasNext()) {
	            System.out.print(li.next() + " ");
	        }

	        // 11. Sorting
	        Collections.sort(a);
	        Collections.sort(l);

	        System.out.println("\n\n11. After sorting:");
	        System.out.println("ArrayList a: " + a);
	        System.out.println("LinkedList l: " + l);

	        // 12. Sublist
	        List<String> asub = a.subList(1, 3);
	        List<String> lsub = l.subList(1, 3);

	        System.out.println("\n12. Sublist from index 1 to 2:");
	        System.out.println("ArrayList a sublist: " + asub);
	        System.out.println("LinkedList l sublist: " + lsub);

	        // 13. Clearing the list
	        a.clear();
	        l.clear();

	        System.out.println("\n13. After clearing the lists:");
	        System.out.println("ArrayList a: " + a);
	        System.out.println("LinkedList l: " + l);
	    }
	}


