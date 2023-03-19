/*
 * Add certain variables of boolean and int data types and test for the if-else conditions
 */
package com.basic.codes.javatutorial.IfElseStatement;

/**
 *
 * @author Pronit Kundu
 */
public class IfElseProgram1 {
    
    public static void main(String[] args) {
        
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        
       int finalScore = score;
       
       if(gameOver) {
           finalScore += (levelCompleted * bonus);
           System.out.println("Your final score is: " + finalScore);
       }
    }
}
