/*
 * Step 1 - Create a method printEqual that has three parameters of type int and does not return any value i.e. void
 * Step 2 - Check if any one of the parameters is less than 0
 * Step 3 - If any one of the parameters is less than 0, print "Invalid Value" on the console
 * Step 4 - If all the numbers are equal, print "All numbers are equal"
 * Step 5 - If all the numbers are different, print "All numbers are different"
 * Step 6 - Else, print "Neither all are equal or different"
 */
package com.basic.codes.javatutorial.Challenges.MethodOverloading;

/**
 *
 * @author Pronit Kundu
 */
public class EqualityPrinter {
    
    public static void printEqual(int firstNumber, int secondNumber, int thirdNumber) {
        
        if((firstNumber < 0) || (secondNumber < 0) || (thirdNumber < 0)) {
            System.out.println("Invalid Value");
        } else if((firstNumber == secondNumber) && (secondNumber == thirdNumber) && (firstNumber == thirdNumber)){
            System.out.println("All numbers are euqal");
    } else if((firstNumber != secondNumber) && (secondNumber != thirdNumber) && (firstNumber != thirdNumber)){
        
            System.out.println("All numbers are different");
    }else {
            System.out.println("Neither all are equal or different");
        }
}
    
    public static void main(String[] args) {
        printEqual(-1, -1, -1);
    }
}
