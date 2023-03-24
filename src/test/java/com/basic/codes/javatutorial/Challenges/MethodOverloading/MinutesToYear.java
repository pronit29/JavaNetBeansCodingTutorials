/*
 * Step 1 - Create a method printYearsAndDays that accepts one parameter of type long and does not return anything i.e. void
 * Step 2 - Check if the parameter is less than 0
 * Step 3 - If the parameter is less than 0 then print "Invalid Value" on the console
 * Step 4 - Else, print the value in the format XX min = YY y and ZZ d
 */
package com.basic.codes.javatutorial.Challenges.MethodOverloading;

/**
 *
 * @author Pronit Kundu
 */
public class MinutesToYear {
    
    public static void printYearsAndDays(long minutes) {
        
        long hours,days,remainingDays,year;
        
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            hours = minutes / 60;
            days = hours / 24;
            year = days / 365;
            System.out.println("Hours: " + hours);
            System.out.println("Days: " + days);
            
            if(days%365 == 0) {
                
                remainingDays = 0;
            } else {
                remainingDays = (days % 365);
            }
            
            System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
        }
        
    }
    
    public static void main(String[] args) {
        printYearsAndDays(1051200);
    }
    
}
