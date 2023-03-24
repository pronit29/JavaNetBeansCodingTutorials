/*
 * Step 1 - Create a method to which accepts one parameter of type int that returns a boolean value
 * Step 2 - Check if the number is prime using for loop
 * Step 3 - Create another method which again accepts one integer parameter and returns void
 * Step 4 - Use for loop to loop through the elements from 2 to N
 * Step 5 - Print all the prime numbers on the console
 */
package com.basic.codes.javatutorial.Challenges.ForLoop;

/**
 *
 * @author Pronit Kundu
 */
public class ListOfPrimeNumbers {
    
    public static boolean isPrime(int wholeNumber) {
        
        if(wholeNumber <= 1) {
            return false;
        }
        
        for(int divisor = 2; divisor < wholeNumber; divisor++) {
            if(wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void listOfPrimes(int endValue) {
        
        System.out.println("List of all the prime numbers: ");
        int count = 0;
        for(int startValue = 1; startValue <= endValue; startValue++){
    
            if(isPrime(startValue)) {
                count++;
                System.out.print(startValue + " ");
            } 
            
            if(count == 5) {
                break;
            }
        }
        System.out.println("");
        System.out.println("Total number of prime numbers in the given range: " + count);
        
    }
    
    public static void main(String[] args) {
        listOfPrimes(30);
    }
    
    
}

