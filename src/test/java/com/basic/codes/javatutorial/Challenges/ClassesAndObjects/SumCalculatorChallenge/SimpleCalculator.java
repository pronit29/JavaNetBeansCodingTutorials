/*
 * Step 1 - Create a class named SimpleCalculator
 * Step 2 - Create two fields of name first and second, both of type double
 * Step 3 - Create getters and setters to access these data members from another class using the object of this class
 * Step 4 - Create a another method getAdditionResult without any parameters and returns the sum value of the two field values
 * Step 5 - Create a another method getSubtractionResult without any parameters and returns the subtracted value of the two field values
 * Step 6 - Create a another method getMultiplicationResult without any parameters and returns the multiplied value of the two field values
 * Step 7 - Create a another method getDivisionResult without any parameters and returns the divided value of the two field values
 * Step 8 - If any one of the parameters is 0, then Step 6 and Step 7 should return 0
 */
package com.basic.codes.javatutorial.Challenges.ClassesAndObjects.SumCalculatorChallenge;

/**
 *
 * @author Pronit Kundu
 */
public class SimpleCalculator {
    
    private double firstNumber;
    private double secondNumber;
    
    public double getFirstNumber(){
        return firstNumber;
    }
    
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    
    public double getSecondNumber(){
        return secondNumber;
    }
    
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    
    public double getAdditionResult(){
        double result = getFirstNumber() + getSecondNumber();
        return result;
    }
    
    public double getSubtractionResult(){
        double result = getFirstNumber() - getSecondNumber();
        return result;
    }
    
    public double getMultiplicationResult(){
        double result = getFirstNumber() * getSecondNumber();
        if((getFirstNumber() == 0) || (getSecondNumber() == 0)) {
            return 0;
        }
        return result;
    }
    
    public double getDivisionResult(){
        double result = getFirstNumber() / getSecondNumber();
        if((getFirstNumber() == 0) || (getSecondNumber() == 0)) {
            return 0;
        }
        return result;
    }
}
