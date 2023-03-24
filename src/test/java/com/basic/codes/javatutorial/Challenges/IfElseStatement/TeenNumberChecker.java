/*
 * Step 1 - Create a method hasTeen with 3 parameters of type int and should return a boolean value
 * Sep 2 - Check if any one of the numbers is withing the range of 13(inclusive) to 19(inclusive)
 * Step 3 - Method returns true if Step 2 is true else return false
 */
package com.basic.codes.javatutorial.Challenges.IfElseStatement;

/**
 *
 * @author Pronit Kundu
 */
public class TeenNumberChecker {
    
    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
        
        if((firstNumber >= 13) && (firstNumber <= 19) || (secondNumber >= 13) && (secondNumber <= 19) || (thirdNumber >= 13) && (thirdNumber <= 19)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        
        System.out.println(hasTeen(23, 15, 42));
    }
}
