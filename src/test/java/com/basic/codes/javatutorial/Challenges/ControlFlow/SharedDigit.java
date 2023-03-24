/*
 * Step 1 - Create a method hasSharedDigit which accepts two parameters of type int and returns a boolean value
 * Step 2 - Check if both the parameters are withing the range 10(inclusive) to 99(inclusive)
 * Step 3 - If any one of the numbers are not within the range then return false
 * Step 4 - Extract digits from both the numbers
 * Step 5 - Check if any one of the digits are there in both the numbers
 * Step 6 - If a match is found then return true
 */
package com.basic.codes.javatutorial.Challenges.ControlFlow;

/**
 *
 * @author Pronit Kundu
 */
public class SharedDigit {
    
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        
        int firstNumberLastDigit = 0;
        int firstNumberFirstDigit = 0;
        int secondNumberLastDigit = 0;
        int secondNumberFirstDigit = 0;
        
        if((firstNumber < 10) || (firstNumber > 99) || (secondNumber < 10) || (secondNumber > 99)) {
            return false;
        } else {
                firstNumberLastDigit = firstNumber % 10;
                firstNumberFirstDigit = firstNumber / 10;
            
            
                secondNumberLastDigit = secondNumber % 10;
                secondNumberFirstDigit = secondNumber / 10;
            
        }
            if((firstNumberLastDigit == secondNumberLastDigit) || (firstNumberLastDigit == secondNumberFirstDigit) ||(firstNumberFirstDigit == secondNumberFirstDigit) || (firstNumberFirstDigit == secondNumberLastDigit)) {
                return true;
            } else {
                return false;
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println("There is a shared digit in both the numbers? " + hasSharedDigit(12, 23));
    }
    
}
