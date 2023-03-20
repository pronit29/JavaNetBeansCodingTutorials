/*
 * Step 1 - Create a method which accepts one integer parameter
 * Step 2 - Check if the number is Positive, Negative or Zero using if-else conditions
 * Step 3 - Print a message to the console stating whether the number is Positive, Negative or Zero
 */
package com.basic.codes.javatutorial.Challenges.IfElseStatement;

/**
 *
 * @author Pronit Kundu
 */
public class PositiveNegativeZeroChallenge {
    
    public static void checkNumber(int number) {
        if(number > 0 ) {
            System.out.println("Positive");
        } else if(number < 0 ) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
    
    public static void main(String[] args) {
        
        checkNumber(0);
    }
}
