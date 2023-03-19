/*
 * Add certain variables of boolean and int data types and test for the if-else conditions
 */
package com.basic.codes.javatutorial.IfElseStatement;

/**
 *
 * @author Pronit Kundu
 */
public class IfElseProgram {
    
    public static void main(String[] args) {
        
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        
        if((score < 5000) && (score > 1000)) {
            System.out.println("Your score was less than 5000 but was greater than 1000");
        } else if(score < 1000) {
            System.out.println("Your score was less than 1000");
        }
        else {
            System.out.println("Got here");
        }
    }
}
