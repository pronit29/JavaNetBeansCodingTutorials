/*
 * Step 1 - Declare a method named displayHighScorePosition with two parameters - one for Player's name and second for Player's position
 * Step 2 - This method should print a message "Tim managed to get into position 2 on the high score list"
 * Step 3 - Declare a second method named calculateHighScorePosition with one parameter - player's score
 * Step 4 - This method should return a number between 1 and 4 based on the scores - score => 1000 --> 1, score => 500 && score < 1000 --> 2
 * score => 100 && score < 500 --> 3 and All other scores --> 4
 */
package com.basic.codes.javatutorial.Challenges.Methods;

/**
 *
 * @author Pronit Kundu
 */
public class MethodsChallenge1 {
    
    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000) {
            return 1;
        } else if ((playerScore >= 500) && (playerScore < 1000) ) {
            return 2;
        } else if((playerScore >= 100) && (playerScore < 500)) {
            return 3;
        }else {
        return 4;
        }
    }
    
    public static void displayHighScorePosition(String playerName, int playerPosition) {
        
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }
    
    public static void main(String[] args) {
        
        displayHighScorePosition("Tim", calculateHighScorePosition(25));
        
    }
}
