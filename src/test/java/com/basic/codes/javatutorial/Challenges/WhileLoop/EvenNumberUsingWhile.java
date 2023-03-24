/*
 * Step 1 - Create a method isEven which accepts one parameter of type int and returns a boolean value
 * Step 2 - Check if the number is prime or not
 * Step 3 - If the number is even, return true else return false
 * Step 4 - Create another method listOfEven which accepts one integer parameter and returns void
 * Step 5 - Use while loop to check all the prime numbers within a range of values
 * Step 6 - Call the first method to check each value individually inside the for loop
 * Step 7 - Print the list of even numbers on the console 
 */
package com.basic.codes.javatutorial.Challenges.WhileLoop;

/**
 *
 * @author Pronit Kundu
 */
public class EvenNumberUsingWhile {
    
    public static boolean isEven(int number) {
        
        if(number <= 1) {
            return false;
        }
        
        if(number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void listOfEven(int startValue, int endValue) {
        
        int countEven = 0;
        int countOdd = 0;
        int sumEven = 0;
        int sumOdd = 0;
        System.out.println("List of even and odd numbers from " + startValue + " to " + endValue + " is: ");
        while(startValue <= endValue) {
            if(isEven(startValue)) {
                System.out.println(startValue + " is an even number ");
                countEven++;
                sumEven += startValue;
            } else {
                
                System.out.println(startValue + " is an odd number ");
                countOdd++;
                sumOdd += startValue;
            }
            startValue++;
        }
        
        System.out.println("");
        System.out.println("Total number of even numbers in the given range is: " + countEven);
        System.out.println("Total number of odd numbers in the given range is: " + countOdd);
        System.out.println("Sum of all the even numbers: " + sumEven);
        System.out.println("Sum of all the odd numbers: " + sumOdd);
    }
    
    public static void main(String[] args) {
        listOfEven(1, 10);
    }
}
