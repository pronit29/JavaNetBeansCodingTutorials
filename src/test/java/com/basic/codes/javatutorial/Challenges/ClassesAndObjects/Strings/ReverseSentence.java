/*
 * Step 1 - Create a method reverse to reverse the sentence which takes one parameter of type String
 * Step 2 - Initialize a reverse variable with an empty string
 * Step 3 - Split up the string and extract each part  of the String and concatenate with the reverse String
 * Step 4 - Print this reverse sentence
 * Step 5 - Sample input - I am good Sample output - good am I
 */
package com.basic.codes.javatutorial.Challenges.ClassesAndObjects.Strings;

/**
 *
 * @author Pronit Kundu
 */
public class ReverseSentence {

    public static String reverseSentence(String inputSentence) {
        System.out.println("Original sentence: " + inputSentence);
        String rev = "";
        String[] split = inputSentence.split(" ");
        int len = split.length;
        if (inputSentence.isEmpty()) {
            return "";
        } else {
            for (int i = 0; i < len; i++) {
                rev = split[i] + " " + rev;
            }
            return rev;
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println("Sentence after reversing: " + reverseSentence("I work in LTIMindtree"));
    }
}
