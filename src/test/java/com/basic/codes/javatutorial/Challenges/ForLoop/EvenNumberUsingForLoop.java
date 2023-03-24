/*
 * Step 1 - Create a method isEven which accepts one parameter of type int and returns a boolean value
 * Step 2 - Check if the number is prime or not
 * Step 3 - If the number is even, return true else return false
 * Step 4 - Create another method listOfEven which accepts one integer parameter and returns void
 * Step 5 - Use for loop to check all the prime numbers within a range of values
 * Step 6 - Call the first method to check each value individually inside the for loop
 * Step 7 - Print the list of even numbers on the console 
 */
package com.basic.codes.javatutorial.Challenges.ForLoop;

/**
 *
 * @author Pronit Kundu
 */
public class EvenNumberUsingForLoop {
    
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
    
    public static void listOfEven(int endValue) {
        
        System.out.println("List of even numbers in the given range: ");
        int count = 0;
        for(int startValue = 1; startValue <= endValue; startValue++) {
            if(isEven(startValue)) {
                count++;
                System.out.print(startValue + " ");
            }
        }
        System.out.println("");
        System.out.println("Total number of even numbers in the given range: " + count);
    }
    
    public static void main(String[] args) {
        listOfEven(20);
    }
    
}
