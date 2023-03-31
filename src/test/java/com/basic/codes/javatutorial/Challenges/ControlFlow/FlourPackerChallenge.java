/*
 * Step 1 - Create a method canPack which accepts 3 parameters of type int and returns a boolean value
 * Step 2 - Check if the sum of the bigCount and smallCount are atleast equal to the value of goal
 * Step 3 - Return true if the conditon in Step 2 matches
 * Step 4 - Check if the sum is greater than the value of goal
 * Step 5 - If true, check that only full bags are used towards the goal amount
 * Step 6 - Return false if any of the parameters are negative
 */
package com.basic.codes.javatutorial.Challenges.ControlFlow;

/**
 *
 * @author Pronit Kundu
 */
public class FlourPackerChallenge {
    
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        
        int totalBigCountKilos;
        int totalSmallCountKilos;
        int sumOfKilos = 0;
        
        if((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        } else {
            totalBigCountKilos = bigCount * 5;
            totalSmallCountKilos = smallCount * 1;
            sumOfKilos = totalBigCountKilos + totalSmallCountKilos;
            //System.out.println("Sum of total kilos of flour: " + sumOfKilos);
        }
            if((sumOfKilos < goal)) {
                return false;
            } else {
                return true;
            }
            
        }
    
    public static void main(String[] args) {
        System.out.println(canPack(5, 3, 24));
    }
    
}
