/*
 * This class demonstrates the example of using a while loop
 */
package com.basic.codes.javatutorial.WhileLoop;

/**
 *
 * @author Pronit Kundu
 */
public class WhileLoopExample {
    
    public static void main(String[] args) {
      
    int number = 0;
    while(number < 50) {
        number += 5;
        if(number % 25 == 0) {
            continue;
        }
        System.out.print(number + "_");
    }
    }
    
}
