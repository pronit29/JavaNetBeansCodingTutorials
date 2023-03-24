/*
 * Step 1 - Create a method isOdd with one parameter of type int and returns a boolean value
 * Step 2 - Check if number is greater than 0
 * Step 3 - If number is less than or equal to 0, return false
 * Step 4 - If number is odd, then return true else false
 * Step 5 - Create a second method sumOdd which accepts to parameters of type int and should return the sum
 * Step 6 - Write a for loop to find out all the odd numbers in a given range
 * Step 7 - Sum up all these odd numbers
 * Step 8 - Print the sum of these odd numbers in the console


 */
package com.basic.codes.javatutorial.Challenges.ForLoop;

/**
 *
 * @author Pronit Kundu
 */
public class SumOdd {
    
    public static boolean isOdd(int number) {
        if(number <= 0) {
            return false;
        }
        
        if(number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
    
    public static int sumOdd(int startValue, int endValue) {
        
        int sum = 0;
        
        if((startValue > 0) && (endValue >= startValue) && (endValue > 0)) {
          
            System.out.println("List of all the odd numbers between " + startValue + " and " + endValue + " : ");
            for(int i = startValue; i <= endValue; i++) {
            if(isOdd(i)) {
                System.out.print(i + " ");
                sum += i;
            }
        }
            System.out.println("");
           return sum;   
        } else {
            return -1;
        }
        
    }
    
    
    public static void main(String[] args) {
        
        System.out.println("Sum of all the odd numbers within the given range: " + sumOdd(1, 13));
                
    }
    
}
