/*
 * Step 1 - Create a method shouldWakeUp that has 2 parameters
 * 1st parameter (isBarking) --> boolean --> Represents if Dog is barking or not
 * 2nd parameter (hourOfDay) --> int --> Represents the hour of the day and valid range of this parameter should be 0 - 23
 * Step 2 - Check if the Dog is barking before 8 or after 22
 * Step 3 - If Step 2 is true, then return true
 * Step 4 - Return false if hourOfDay is less than 0 or greater than 23
 */
package com.basic.codes.javatutorial.Challenges.IfElseStatement;

/**
 *
 * @author Pronit Kundu
 */
public class BarkingDog {
    
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        
        if((isBarking) && (hourOfDay < 0) || (hourOfDay > 23)) {
            return false;
        } else if((!isBarking) && (hourOfDay >= 0) && (hourOfDay <= 23)) {
            return false;
        } else if((isBarking) && (hourOfDay >= 0) && (hourOfDay < 8) || (hourOfDay > 22) && (hourOfDay <= 23)){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        System.out.println(shouldWakeUp(true, 0));
    }
    
}
