/*
 * Step 1 - Create a method toMilesPerHour that accepts one parameter of type double kilometersPerHour but returns a long value
 * Step 2 - Check if this parameter has value greater than 0 or less than 0
 * Step 3 - If this parameter is less than 0, then the method should return -1 to indicate the "Invalid Value"
 * Step 4 - If the parameter has a positive value, calculate the value of miles per hour and round it off ( 1 mile per hour --> 1.609 kilometer per hour )
 * Step 5 - Create a second method printConversion that accepts one parameter of type double kilometersPerHour but the method does not return any value i.e. it returns void
 * Step 6 - Calculate miles per hour from kilometers from hour using this method
 * Step 7 - Print a message in the console in the format --> XX km/h = YY mi/h
 * Step 8 - Check if kilometer per hour value is less than 0
 * Step 9 - If Step 8 is true, then print "Invalid Value" in the console
 * Note - Use the Math.round() method for rounding the values
 */
package com.basic.codes.javatutorial.Challenges.IfElseStatement;

/**
 *
 * @author Pronit Kundu
 */
public class SpeedConverter {
    
    public static long toMilesPerHour(double kilometersPerHour) {
        long convertedSpeed;
        if(kilometersPerHour < 0) {
            return -1;
        } else {
            convertedSpeed = Math.round(kilometersPerHour/1.609);
        }
        return convertedSpeed;
    }
    
    public static void printConversion(double kilometersPerHour) {
        long convertedSpeed;
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            convertedSpeed = Math.round(kilometersPerHour/1.609);
            System.out.println(kilometersPerHour + " km/h = " + convertedSpeed + " mi/h");
        }
    }
    
    public static void main(String[] args) {
        
        printConversion(10.25);
        System.out.println(toMilesPerHour(60.5));
    }
    
}
