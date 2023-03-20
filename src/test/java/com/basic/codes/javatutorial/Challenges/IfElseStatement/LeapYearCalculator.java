/*
 * Step 1 - Create a method isLeapYear which accepts an int parameter
 * Step 2 - Parameter should be within the range of 1 - 9999
 * Step 3 - Return false if parameter is not within this range
 * Step 4 - Calculate leap year or not if paramater is withing the range and return true
 * Step 5 - Should be divisible by 4 with no remainders
 * Should be divisible by 100 with no remainders
 * Should be divisible by 400 with no remainders
 * Step 5 - Return true if the parameter satisfies all the conditions in Step 4
 */
package com.basic.codes.javatutorial.Challenges.IfElseStatement;

/**
 *
 * @author Pronit Kundu
 */
public class LeapYearCalculator {
    
    public static boolean isLeapYear(int year) {
        
        if((year < 1) || (year > 9999) ) {
            return false;
        } else if((year % 4 == 0 ) && (year % 100 != 0) ||
                
                (year % 400 == 0) && (year >= 1) && (year <= 9999)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println(isLeapYear(1924));
    }
}

