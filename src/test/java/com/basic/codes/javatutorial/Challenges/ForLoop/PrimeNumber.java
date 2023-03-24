/*
 * Step 1 - Create a method isPrime with one parameter of type int and returns a boolean value
 * Step 2 - Check if a number is prime or not
 * Step 3 - If it is prime, print on the console "The number is a prime number"
 * STep 4 - If not, print "The number is not a prime number"
 */
package com.basic.codes.javatutorial.Challenges.ForLoop;

/**
 *
 * @author Pronit Kundu
 */
public class PrimeNumber {
    
    public static boolean isPrime(int number){
        
        if(number <= 1){
            return false;
        }
        
        for(int divisor = 2; divisor < number; divisor++) {
           
            if(number % divisor == 0) {
                return false;
            }
        }
            return true;
    }
    
    public static void main(String[] args) {
        
        System.out.println("Number is prime or not: " + isPrime(5));
    }
    
}
