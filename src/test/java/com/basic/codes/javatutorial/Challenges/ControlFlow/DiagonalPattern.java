/*
 * Step 1 - Create a method printSquareStar which accepts one parameter of type int and returns nothing i.e. void
 * Step 2 - Check if the number is less than 5
 * Step 3 - If number is less than 5 then print "Invalid Value" on the console
 * Step 4 - Else, print * in the console to print the star rectangle
 */
package com.basic.codes.javatutorial.Challenges.ControlFlow;

/**
 *
 * @author Pronit Kundu
 */
public class DiagonalPattern {
    
    public static void printSquareStar(int number) {
        
        if(number < 5) {
            System.out.println("Invalid Value");
        } else {
            
            for(int i = 0; i < number; i++){
                for(int j = 0 ; j < number; j++){
                    if(i == 0 || i == number - 1 || j == 0 || j == number - 1 || i == j || i + j == number - 1){
                       System.out.print("*");
                    }else {
                    System.out.print(" ");
                    }
                }
                System.out.println();
                
        }
                } 
            
    }
    
    public static void main(String[] args) {
        printSquareStar(5);
    }
}
