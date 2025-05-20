/*
 Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()
 */
package strings;

public class remove_Whitespaces {


		    public static String removeWhitespace(String str) {
		        if (str == null) {
		            return null;
		        }
		        return str.replaceAll("\\s+", "");
		    }

		    public static void main(String[] args) {
		        String str = " Hello World ";
		   
		        System.out.println("Without whitespace: '" + removeWhitespace(str) + "'"); 
		    
		    }

}
