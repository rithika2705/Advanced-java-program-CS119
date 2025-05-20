/*
 1. Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not
 */
package listInterface;
import java.util.*;
public class contains_red {

	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		System.out.println(ls);
		//Contains or not
		if(ls.contains("red")) {
			System.out.println("Contains Red");
		}else {
			System.out.println("Does not contain Red");
		}
	}

}
