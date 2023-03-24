/*
 * Step 1 - Create a method printFactors that accepts one parameter of type int and does not return any value i.e. void
 * Step 2 - Check if the number is less than 1
 * Step 3 - If the number is less than 1, print "Invalid Value" on the console
 * Step 4 - Else, print all the factors associated with that number
 */
package com.basic.codes.javatutorial.Challenges.ControlFlow;

/**
 *
 * @author Pronit Kundu
 */
public class AllFactorsOfNumber {
    
    public static void printFactors(int number){
        if(number < 1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println("List of all the factor of " + number + " is: ");
            for(int i = 1; i <= number; i++) {
                if(number % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
        printFactors(-1);
    }
    
}
