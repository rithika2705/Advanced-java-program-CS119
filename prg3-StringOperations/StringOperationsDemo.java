/*
 3 a. Develop a java program for performing various string operations with different string
handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String
Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
contains( ) and startsWith() and endsWith()
 */
package prg3a;
public class StringOperationsDemo { 
	    public static void main(String[] args) {

	        // 1. String Creation and Basic Operations
	        String s1 = "Hello";
	        String s2 = "World";
	        System.out.println("s1: " + s1);
	        System.out.println("s2: " + s2);

	        // 2. Length and Character Access
	        System.out.println("Length of s1: " + s1.length());
	        System.out.println("Character at index 1 in s1: " + s1.charAt(1));

	        // 3. String Comparison
	        String s3 = "hello";
	        System.out.println("s1.equals(s3): " + s1.equals(s3));
	        System.out.println("s1.equalsIgnoreCase(s3): " + s1.equalsIgnoreCase(s3));
	        System.out.println("s1.compareTo(s2): " + s1.compareTo(s2));

	        // 4. String Searching
	        System.out.println("s1 contains 'll': " + s1.contains("ll"));
	        System.out.println("s2 indexOf 'o': " + s2.indexOf('o'));

	        // 5. Substring Operations
	        String sub = s1.substring(1, 4); // "ell"
	        System.out.println("Substring of s1 from index 1 to 3: " + sub);

	        // 6. String Modification
	        String modified = s1.replace('l', 'x');
	        System.out.println("s1 after replace: " + modified);
	        String upper = s1.toUpperCase();
	        String lower = s2.toLowerCase();
	        System.out.println("s1 toUpperCase: " + upper);
	        System.out.println("s2 toLowerCase: " + lower);

	        // 7. Whitespace Handling
	        String messy = "   Java Programming   ";
	        System.out.println("Before trim: '" + messy + "'");
	        System.out.println("After trim: '" + messy.trim() + "'");

	        // 8. String Concatenation
	        String joined = s1 + " " + s2;
	        System.out.println("Concatenated string: " + joined);

	        // 9. String Splitting
	        String colors = "Red,Green,Blue,Yellow";
	        String[] colorArray = colors.split(",");
	        System.out.println("Splitted colors:");
	        for (String color : colorArray) {
	            System.out.println(color);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Start");
	        sb.append(" -> Middle");
	        sb.insert(6, "Insert ");
	        sb.replace(0, 5, "Begin");
	        sb.delete(13, 20);
	        System.out.println("StringBuilder result: " + sb.toString());

	        // 11. String Formatting
	        int age = 21;
	        String name = "Rithika";
	        String formatted = String.format("Name: %s, Age: %d", name, age);
	        System.out.println("Formatted string: " + formatted);

	        // 12. Validate Email
	        String email = "rithika2705@example.com";
	        boolean valid = email.contains("@") &&
	                        email.startsWith("rithika") &&
	                        email.endsWith(".com");
	        System.out.println("Email '" + email + "' is valid: " + valid);
	    }
	}
