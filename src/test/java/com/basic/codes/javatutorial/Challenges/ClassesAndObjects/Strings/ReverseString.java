/*
 * Step 1 - Create a method reverse to reverse the String which takes one parameter of type String
 * Step 2 - Initialize a reverse variable with an empty string
 * Step 3 - Extract each character of the String and concatenate with the reverse String
 * Step 4 - Print this reverse String
 * Step 5 - Sample input - Pronit Sample output - tinorP
 */
package com.basic.codes.javatutorial.Challenges.ClassesAndObjects.Strings;

/**
 *
 * @author Pronit Kundu
 */
public class ReverseString {

    public static void main(String[] args) {
        
        System.out.println("Reverse string: " + reverse("Pronit"));

    }

    public static String reverse(String inputString) {
        System.out.println("Original string: " + inputString);
        String rev = "";
        if (inputString.isEmpty()) {
            return "";
        } else {
            
            char[] ch = inputString.toCharArray();
            int len = inputString.length();
            for(int i = len - 1; i >= 0; i--) {
                rev = rev + ch[i];
            }
            return rev;
        }
    }
}
