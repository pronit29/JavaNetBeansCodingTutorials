/*
 * Step 1 - Create a method hasSameLastDigit which accepts three parameters of type int and return a boolean value
 * Step 2 - Check if all the numbers are withing the range 10(inclusive) to 1000(inclusive)
 * Step 3 - If any of the numbers do not match the condition, then return false
 * Step 4 - Extract the last digits of all the three numbers
 * Step 5 - Check if the last digit matches for atleast two of the parameters
 * Step 6 - If a match is found, return true else return false
 * Step 7 - Create another method isValid with one parameter of type int and returns a boolean value
 * Step 8 - Check if a number is within the range of 10(inclusive) to 1000(inclusive)
 * Step 9 - If the number is within the range then return true else return false
 * Step 10 - Reuse this methodin the first method
 */
package com.basic.codes.javatutorial.Challenges.ControlFlow;

/**
 *
 * @author Pronit Kundu
 */
public class LastDigitChecker {
    
    public static boolean isValid(int number) {
        
        if((number < 10) || (number > 1000)) {
            return false;
        } else {
            return true;
        }
        
    }
    
    
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        
        int firstNumberLastDigit = 0;
        int secondNumberLastDigit = 0;
        int thirdNumberLastDigit = 0;
        
        if((!isValid(firstNumber)) || (!isValid(secondNumber)) || (!isValid(thirdNumber))) {
            return false;
        } else {
            
            firstNumberLastDigit = firstNumber % 10;
            secondNumberLastDigit = secondNumber % 10;
            thirdNumberLastDigit = thirdNumber % 10;
        }
        if((firstNumberLastDigit == secondNumberLastDigit) || (firstNumberLastDigit == thirdNumberLastDigit) || (secondNumberLastDigit == thirdNumberLastDigit) || (firstNumberLastDigit == secondNumberLastDigit) && (firstNumberLastDigit == thirdNumberLastDigit) && (secondNumberLastDigit == thirdNumberLastDigit)) {
            return true;
        }else {
            return false;
        }
        
    }
    
    public static void main(String[] args) {
        
        System.out.println("There are matching digits in the numbers? " + hasSameLastDigit(8, 41, 55));
    }
}
