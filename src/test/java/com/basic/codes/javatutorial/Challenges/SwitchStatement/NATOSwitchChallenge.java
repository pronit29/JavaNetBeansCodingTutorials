/*
 * Step 1 - Create a method which accepts a parameter of type char
 * Step 2 - Frame a traditional switch statement to check the Alphabets and the corresponding NATO words
 * STep 3 - If the input character is not found, return a message of not found in the default block
 */
package com.basic.codes.javatutorial.Challenges.SwitchStatement;

/**
 *
 * @author Pronit Kundu
 */
public class NATOSwitchChallenge {
    
    public static void switchNATO(char inputChar) {
        
        switch(inputChar) {
            case 'A': case 'a' :
            System.out.println("The word corresponding to " + inputChar + " is: Able");
            break;
            case 'B': case 'b' :
            System.out.println("The word corresponding to " + inputChar + " is: Baker");
            break;
            case 'C': case 'c' :
            System.out.println("The word corresponding to " + inputChar + " is: Charlie");
            break;
            case 'D': case 'd' :
            System.out.println("The word corresponding to " + inputChar + " is: Dog");
            break;
            case 'E': case 'e' :
            System.out.println("The word corresponding to " + inputChar + " is: Easy");
            break;
            default:
                System.out.println("The input character " + inputChar + " is not a match with this list");
            
        }
    }
    
    public static void main(String[] args) {
        
        switchNATO('a');
    }
}
