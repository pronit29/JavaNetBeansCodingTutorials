/*
 * Step 1 - Create one method convertToCentimeters which accepts one parameter of type int and returns double
 * Step 2 - The method converts the height in inches to centimeters
 * Step 3 - Create a second method with the same name convertToCentimeters which accepts two parameters and returns double
 * Step 4 - One parameter represents height in feet and second parameter represent the remaining height in inches
 * Step 5 - This method calculates the height in inches from feet and inches
 * Step 6 - Call the first method and return the height in centimeters which returns a double
 */
package com.basic.codes.javatutorial.Challenges.MethodOverloading;

/**
 *
 * @author Pronit Kundu
 */
public class MethodOverloadingChallenge1 {
    
    public static double convertToCentimeters(int heightInInches) {
        double heightInCentimeter;
        heightInCentimeter = heightInInches * 2.54;
        return heightInCentimeter;
    }
    
    public static double convertToCentimeters(int heightInFeet, int remainingheightInInches) {
        int totalHeightInInch;
        totalHeightInInch = (heightInFeet * 12) + remainingheightInInches;
        return convertToCentimeters(totalHeightInInch);
    }
    
    public static void main(String[] args) {
        
        System.out.println("Height converted from inch to centimeter: " + convertToCentimeters(60));
        System.out.println("Height converted from feet to inch and then to centimeter: " + convertToCentimeters(5,8));
    }
    
    
    
}
