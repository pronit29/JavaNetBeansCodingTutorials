/*
 * Step 1 - Create a double variable with a value of 20.00.
 * Step 2 - Create a second double variable with a value of 80.00.
 * Step 3 - Add both the numbers together, then Multiply by 100.00.
 * Step 4 - Use the remainder operator, to figure out what the remainder from the result of the operation in Step 3 and 40.00 will be
 * Step 5 - Create a boolean variable that assigns the value true, if the remainder in Step 4 is 0.00, or false if it's not zero.
 * Step 6 - Print the boolean value in the console
 * Step 7 - Write an if-else statement that displays the message, "Got some remainder", if the boolean in the Step 5 is not true
 */
package com.basic.codes.javatutorial.Challenges.Operators;

/**
 *
 * @author Pronit Kundu
 */
public class OperatorChallenge {

    public static void main(String[] args) {
        
        double firstVariable = 20.00;
        double secondVariable = 80.00;
        double result, remainder;
        
        result = (firstVariable + secondVariable) * 100.00;
        System.out.println("The total result of the arithmetic operations: " + result);
        remainder = result % 40.00;
        
        boolean isZero = (remainder == 0.00) ? false : true;
        System.out.println("The number has a remainder: " + isZero);
        
        if(isZero) {
            System.out.println("Got some remainder");
        }
        
        
        
    }
}
