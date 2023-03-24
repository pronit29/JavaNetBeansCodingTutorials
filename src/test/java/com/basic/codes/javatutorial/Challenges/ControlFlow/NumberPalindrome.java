/*
 * Step 1 - Create a method isPalindrome which accepts one parameter and returns a boolean value
 * Step 2 - Check if the number is Palindrome
 * Step 3 - Return true if it is a Palindrome else return false
 */
package com.basic.codes.javatutorial.Challenges.ControlFlow;

/**
 *
 * @author Pronit Kundu
 */
public class NumberPalindrome {
    
    public static boolean isPalindrome(int number) {
        
        int reverse = 0;
        int lastDigit;
        int initialNumber = number;
        while(number != 0) {
            
            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
            
        }
        
        if(reverse == initialNumber) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println("Number is Palindrome? " + isPalindrome(123));
    }
    
    
}
