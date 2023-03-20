/*
 * Step 1 - Create a method areEqualByThreeDecimalPlaces which accepts two parameters of type double and method should return a boolean value
 * Step 2 - Check if both these numbers are same upto 3 decimal places
 * Step 3 - Return true if Step 2 is true else return false
 */
package com.basic.codes.javatutorial.Challenges.IfElseStatement;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author Pronit Kundu
 */
public class DecimalComparator {
    
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        
        
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println(df.format(firstNumber));
        System.out.println(df.format(secondNumber));
        if(df.format(firstNumber).equals(df.format(secondNumber))) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.175));
    }
}
