/*
 * Step 1 - Create a method isPalindrome which accepts one parameter of type String and returns a boolean value
 * Step 2 - Initialize a variable with an empty string
 * Step 3 - Using for loop extract each character from the String and concat with the variable containing the empty string
 * Step 4 - Compare the original string and the reversed string
 * Ste 5 - If they match return true else return false
 */
package com.basic.codes.javatutorial.Challenges.ClassesAndObjects.Strings;

/**
 *
 * @author Pronit Kundu
 */
public class StringPalindrome {
    
    public static void main(String[] args) {
        
        System.out.println("Is the string a palindrome or not? " + isPalindrome("Pronit"));
    }
    
   public static boolean isPalindrome(String inputString) {
       
       String reverse = "";
       System.out.println("Original String: " + inputString);
       char[] ch = inputString.toCharArray();
       int len = inputString.length();
       
       for(int i = len - 1; i >= 0; i--) {
           reverse += ch[i];
       }
       System.out.println("String after reversal: " + reverse);
       if(reverse.equalsIgnoreCase(inputString)){
           return true;
       } else {
           return false;
       }
   } 
   
}
