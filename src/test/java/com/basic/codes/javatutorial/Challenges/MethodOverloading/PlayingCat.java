/*
 * Step 1 - Create one method isCatPlaying with two parameters and the method returns a boolean value
   1st Parameter - boolean - representing summer, 2nd Parameter - int representing temperature range
 * Step 2 - Check if summer parameter is true, then the temperature range should be 25 to 35
 * Step 3 - Check if summer parameter is false, them the temperature range should be 25 to 45
 * Step 4 - If the conditions in Step 2 and Step 3 are not met then the method should return false else should return true
 */
package com.basic.codes.javatutorial.Challenges.MethodOverloading;

/**
 *
 * @author Pronit Kundu
 */
public class PlayingCat {
    
    public static boolean isCatPlaying(boolean summer, int temperature) {
        
        if((summer) && (temperature >= 25) && (temperature <= 35)) {
            return true;
        } else if((summer) && (temperature < 25) || (temperature > 35)) {
            return false;
        } else if((!summer) && (temperature >= 25) && (temperature <= 45)) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public static void main(String[] args) {
        
        System.out.println("Playing cat is: " + isCatPlaying(false, 10));
    }
}
