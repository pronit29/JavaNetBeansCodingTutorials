/*
 * Add certain variables of boolean and int data types and test for the if-else conditions
 * Implement the concept of Methods to remove the code duplications inside the code
 */
package com.basic.codes.javatutorial.IfElseStatement;

/**
 *
 * @author Pronit Kundu
 */
public class MethodExample1 {
    
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        
        int finalScore = score;
        
        if(gameOver) {
            finalScore += 1000 + (levelCompleted * bonus);
        }
        return finalScore;
    }
    
    public static void main(String[] args) {
       
       System.out.println("<------------Before the new challenge code is incorporated--------------->");
       
       int highScore =  calculateScore(true,800, 5, 100);
        System.out.println("The high score is: " + highScore);
       
        System.out.println("<------------After the new challenge code is incorporated--------------->");
       
        System.out.println("The next high score is: " + calculateScore(true, 10000, 8, 200));
    }
    
    
}
