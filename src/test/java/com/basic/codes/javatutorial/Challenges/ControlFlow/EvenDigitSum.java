/*
 * Step 1 - Create a method getEvenDigitSum which accepts one parameter of type int and returns the sum of the even digits in the number
 * Step 2 - Check if the number is positive or negative
 * Step 3 - If the number is negative, return -1
 * Step 4 - If the number is positive, extract all the digits
 * Step 5 - Check if the extracted digits are even
 * Step 6 - If the extracted digits are even, then add all these even digits and return the sum
 */
package com.basic.codes.javatutorial.Challenges.ControlFlow;

/**
 *
 * @author Pronit Kundu
 */
public class EvenDigitSum {
    
    public static int getEvenDigitSum(int number) {
        
        int lastDigit;
        int sum = 0;
        
        if(number < 0) {
            return -1;
        } else {
            while(number != 0) {
                
                lastDigit = number % 10;
                number = number / 10;
                
                if((lastDigit % 2) == 0) {
                    sum += lastDigit;
                }
            }
            return sum;
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println("Sum of all the even digits in the number: " + getEvenDigitSum(-22) );
    }
}
