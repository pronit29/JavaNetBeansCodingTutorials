/*
 * Step 1 - Create a method isPerfectNumber which accepts one parameter and returns a boolean value
 * Step 2 - Check if the number is less than 1
 * Step 3 - If the number is less than 1, then return false
 * Step 4 - Return true if the number is perfect number
 */
package com.basic.codes.javatutorial.Challenges.ControlFlow;

/**
 *
 * @author Pronit Kundu
 */
public class PerfectNumber {
    
    public static boolean isPerfectNumber(int number) {
        
        long sum = 0;
        System.out.println("The list of divisors of the " + number + " is: ");
        if (number < 1) {
            return false;
        } else {
            
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                    sum += i;
                }
            }
            System.out.println("");
        }
        
        if(sum == number) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Number is a Perfect Number? " + isPerfectNumber(33550336));
    }
}
