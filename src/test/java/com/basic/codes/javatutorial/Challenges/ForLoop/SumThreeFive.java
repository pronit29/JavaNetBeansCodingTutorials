/*
 * Step 1 - Create a method which accepts one parameter of type int and returns void
 * Step 2 - Use a for loop to check all the numbers in the given range which are divisible by both 3 and 5
 * Step 3 - Print these numbers in the console
 * Step 4 - Break out of the loop is we have come across 5 such numbers
 * Step 5 - Print the sum of all these numbers
 */
package com.basic.codes.javatutorial.Challenges.ForLoop;

/**
 *
 * @author Pronit Kundu
 */
public class SumThreeFive {
    
    public static void sumOfThreeFiveNumbers(int endValue){
        
       int counter = 0;
       int sum = 0;
       System.out.println("List of numbers that are divisible by both 3 and 5 are: ");
       for(int startValue = 1; startValue <= endValue; startValue++) {
           
           if((startValue % 3 == 0) && (startValue % 5 == 0)) {
               System.out.print(startValue + " ");
               counter++;
               sum += startValue;
           }
           
           if(counter == 5) {
               break;
           }
           
       }
        System.out.println("");
        System.out.println("Total count of numbers that are divisible by both 3 and 5 are: " + counter);
        System.out.println("Sum of all the numbers that are divisible by both 3 and 5 are: " + sum);
        
        
    }
    
    public static void main(String[] args) {
        
        sumOfThreeFiveNumbers(1000);
    }
}
