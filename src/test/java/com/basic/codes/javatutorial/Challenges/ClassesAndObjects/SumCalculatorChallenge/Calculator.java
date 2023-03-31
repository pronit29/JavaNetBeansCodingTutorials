/*
 * This class creates an object of the SimpleCalculator class and accesses the data members and method of the class SimpleCalculator
 */
package com.basic.codes.javatutorial.Challenges.ClassesAndObjects.SumCalculatorChallenge;

/**
 *
 * @author Pronit Kundu
 */
public class Calculator {
    
    public static void main(String[] args) {
        
        SimpleCalculator sc = new SimpleCalculator();
        sc.setFirstNumber(5.0);
        sc.setSecondNumber(4);
        System.out.println("Result of addition: " + sc.getAdditionResult());
        System.out.println("Result of subtraction: " + sc.getSubtractionResult());
        sc.setFirstNumber(5.25);
        sc.setSecondNumber(0);
        System.out.println("Result of multiplication: " + sc.getMultiplicationResult());
        System.out.println("Result of division: " + sc.getDivisionResult());
    }
}
