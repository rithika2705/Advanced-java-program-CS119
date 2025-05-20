/*
5. Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index
 */
package listInterface;
import java.util.*;
public class n_thremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Orange");
		ls.add("green");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
			
		System.out.println(ls);
		System.out.println("Removing the 4th  Element(index 3) :"+ls.remove(3));
		System.out.println(ls);
	}

}
