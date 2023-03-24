/*
 * Step 1 - Create a method sumDigits which accepts one parameter of type int and returns an int value
 * Step 2 - Check if the number is positive
 * Step 3 - If the number is not positive then return -1 to depict an invalid number
 * Step 4 - Extract the digits from the number
 * Step 5 - Add these digits
 * Step 6 - Print the sum of these digits on the console
 */
package com.basic.codes.javatutorial.Challenges.WhileLoop;

/**
 *
 * @author Pronit Kundu
 */
public class DigitSumChallenge {
    
    public static int sumDigits(int number) {
        int sum = 0;
        int temp;
        int lastDigit;
        
        if(number < 0) {
            return -1;
        } else {
            while(number != 0 ) {
                
               lastDigit = number % 10;
               temp = lastDigit;
               number /= 10;
               sum += temp;
            }
            return sum;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Sum of the digits of the input number: " + sumDigits(-138));
    }
    
}
