/*
 * This class demonstrates the usage of for-loop
 */
package com.basic.codes.javatutorial.ForLoop;

/**
 *
 * @author Pronit Kundu
 */
public class ForLoopExample {
    
    public static void forStatement(int number) {
        for(int i = 1; i <= number; i++){
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        forStatement(5);
    }
    
}
