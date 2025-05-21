/*
 Q10. Write a Java Program for Counting the number of words in a string using user defined function
countWords()
 */
package strings;  

public class count_Words {
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String str1 = "samay is good";
        String str2 = "";
 

        System.out.println( str1 + ": " + countWords(str1)); 
   
        System.out.println(str2 + ": " + countWords(str2)); 
       
    }

}
