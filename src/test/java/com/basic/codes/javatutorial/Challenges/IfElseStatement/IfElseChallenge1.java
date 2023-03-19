/*
 * Add certain variables of boolean and int data types and test for the if-else conditions
 */
package com.basic.codes.javatutorial.Challenges.IfElseStatement;

import com.basic.codes.javatutorial.IfElseStatement.*;

/**
 *
 * @author Pronit Kundu
 */
public class IfElseChallenge1 {
    
    public static void main(String[] args) {
        
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        
       int finalScore = score;
       
       System.out.println("<------------Before the new challenge code is incorporated--------------->");
       
       if(gameOver) {
           finalScore += (levelCompleted * bonus);
           System.out.println("Your final score is: " + finalScore);
       }
       
        System.out.println("<------------After the new challenge code is incorporated--------------->");
       
       score = 10000;
       levelCompleted = 8;
       bonus = 200;
       
       if(gameOver) {
          finalScore += (levelCompleted * bonus);
           System.out.println("Your final score is: " + finalScore); 
           
       }
    }
}
