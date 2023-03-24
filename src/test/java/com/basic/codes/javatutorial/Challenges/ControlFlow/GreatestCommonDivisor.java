/*
 * Step 1 - Create a method getGreatestCommonDivisor which accepts two parameters of type int and should return an int value
 * Step 2 - Check if any of the parameters is less than 10
 * Step 3 - If any one of the parameters is less than 10, then return -1
 * Step 4 - Calculate the Greatest Common Divisor of these two numbers
 * Step 5 - Print the Greatest Common Divisor on the console
 */
package com.basic.codes.javatutorial.Challenges.ControlFlow;

/**
 *
 * @author Pronit Kundu
 */
public class GreatestCommonDivisor {
    
    public static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {
        
        int gcd = 0;
        int i,j;
        if((firstNumber < 10) || (secondNumber < 10)) {
            return -1;
        } else {
            
            for(i = 1; i <= firstNumber && i <= secondNumber; i++) {
                if((firstNumber % i == 0) && (secondNumber % i == 0)) {
                    gcd = i;
                }
            }
        }
        return gcd;
    }
    
    public static void main(String[] args) {
        
        System.out.println("The Greatest Common Divisor of both the numbers: " + getGreatestCommonDivisor(12, 30));
    }
}
