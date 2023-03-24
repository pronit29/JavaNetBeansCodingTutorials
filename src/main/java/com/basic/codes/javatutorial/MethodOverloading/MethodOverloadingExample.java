/*
 * This class is created to demonstrate the use of Method Overloading Java
 */
package com.basic.codes.javatutorial.MethodOverloading;

/**
 *
 * @author Pronit Kundu
 */
public class MethodOverloadingExample {
    
    public static int calculateScore(String playerName, int score) {
        
        System.out.println("Player " + playerName + " has scored " + score + " runs");
        return score*10;
    }
    
     public static int calculateScore(int score) {
        
        System.out.println( "Unnamed player has scored " + score + " runs");
        return score*10;
    }
    
    
    
    public static void main(String[] args) {
        
        int newScore = calculateScore("Virat Kohli", 100);
        System.out.println("New score is: " + newScore);
        
        int newScoreUnnamedPlayer = calculateScore(150);
        System.out.println("New score is: " + newScoreUnnamedPlayer);
    }
    
}
