/*
 * Step 1 - Create a method hasEqualSum with 3 parameters and the function returns a boolean
 * Step 2 - Sum of the first and the second parameter
 * Step 3 - Check if the sum of the first two parameters are equal to the third parameter
 * Step 4 - Return true if Step 3 is true else return false
 */
package com.basic.codes.javatutorial.Challenges.IfElseStatement;

/**
 *
 * @author Pronit Kundu
 */
public class EqualSumChecker {
    
    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber) {
        int sumOfFirstTwoNumbers = firstNumber + secondNumber;
        
        if(sumOfFirstTwoNumbers == thirdNumber) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println(hasEqualSum(1, -1, 1));
    }
}
