/*
 * Step 1 - Create a method getLargestPrime which accepts one parameter of type int and returns an int value
 * Step 2 - Check if the number is negative
 * Step 3 - If the number is negative, return -1
 * Step 4 - Find the factors of the number
 * Step 5 - Check if the factors contain any prime number
 * Step 6 - If condition matches in Step 5, then return the largest prime number else return -1
 */
package com.basic.codes.javatutorial.Challenges.ControlFlow;

/**
 *
 * @author Pronit Kundu
 */
public class LargestPrime {

    public static int getLargestPrime(int number) {

        int count = 0;
        //int largestPrime;
        if (number <= 1) {
            return -1;
        } else {
            System.out.println("List of all the factors of " + number + " is: ");
            for (int divisor = 1; divisor <= number; divisor++) {

                if ((number % divisor) == 0) {

                    System.out.print(divisor + " ");
                    count++;

                    if (count > 2) {
                       
                        for (int div = 2; div < divisor; div++) {
                            if ((divisor % div != 0)) {
                                return divisor;
                            }
                        }
                    } else if ((divisor == number) && (count == 2)) {
                        
                                return divisor;
                            }
                        }

                    
                }

            
            return -1;
        }
    }

    public static void main(String[] args) {

        System.out.println("The largest prime within the factors is: " + getLargestPrime(16));
    }

}
