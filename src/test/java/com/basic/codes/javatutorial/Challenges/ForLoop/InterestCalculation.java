/*
 * Step 1 - Create a method that accepts two parameters of type double and returns a double value
 * Step 2 - Calculate the interest using the formula (amount * (interestRate/100))
 * Step 3 - Create a for loop to calculate the interest for 2.0,3.0,4.0,5.0 rate of interest
 */
package com.basic.codes.javatutorial.Challenges.ForLoop;

/**
 *
 * @author Pronit Kundu
 */
public class InterestCalculation {
    
    public static double calculateInterest(double amount, double interestRate) {
        double interest = (amount * (interestRate / 100));
        return interest;
    }
    
    public static void main(String[] args) {
        
        System.out.println("<------------FIRST FOR LOOP---------------->");
        for(double rate = 2.0; rate <= 5.0; rate++) {
            System.out.println("10,000 at " + rate + "% interest: " + calculateInterest(10000.0, rate));
        }
       
        System.out.println("<------------SECOND FOR LOOP---------------->");
        for(double newRate = 7.5; newRate <= 10; newRate += 0.25) {
            System.out.println("100 at " + newRate + "% interest: " + calculateInterest(100.0, newRate));
        }
    }
}
