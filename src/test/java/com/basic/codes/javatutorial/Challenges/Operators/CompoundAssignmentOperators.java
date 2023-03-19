/*
 * Step 1 - Initialize int variable with a certain value
 * Step 2 - Use the compound minus operator to perform subtraction operations
 * Step 3 - Print the output to the console
 */
package com.basic.codes.javatutorial.Challenges.Operators;

/**
 *
 * @author Pronit Kundu
 */
public class CompoundAssignmentOperators {
    
    public static void main(String[] args) {
        
        int result = 10;
        int finalResult = 10 - 2;
        
        System.out.println("Subtracted value using second variable: " + finalResult);
        System.out.println("Subtracted value using the compound expression: " + result--);
        
        result -= 5;
        System.out.println("Subtracted value using the second type of compound expression: " + result);
    }
    
}
