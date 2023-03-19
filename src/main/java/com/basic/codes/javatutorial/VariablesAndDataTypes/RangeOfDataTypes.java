/*
 * Find out the Range of all the Data Types using the built-in functions of the respective Wrapper Classes
 * Print the range values in the Console
 * Also, find the width of all the Data Types using the built-in functions of the respective Wrapper Classes
 * Print the width in the Console
 */
package com.basic.codes.javatutorial.VariablesAndDataTypes;

/**
 *
 * @author Pronit Kundu
 */
public class RangeOfDataTypes {
    public static void main(String[] args) {
        
        // Below lines print the Minimum and Maximum range values of all the data types
        System.out.println("<----------------List of all the Range Values of the Data Types---------------------->");
        System.out.println("Integer value Range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");
        System.out.println("Byte value Range (" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");
        System.out.println("Short value Range (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");
        System.out.println("Long value Range (" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");
        
        // Below lines print the Width of all the data types
        System.out.println("<----------------List of all the Width of the Data Types---------------------->");
        System.out.println("An integer has a width of: " + Integer.SIZE);
        System.out.println("A byte has a width of: " + Byte.SIZE);
        System.out.println("A short has a width of: " + Short.SIZE);
        System.out.println("A long has a width of: " + Long.SIZE);
        
        
    }
    
}
