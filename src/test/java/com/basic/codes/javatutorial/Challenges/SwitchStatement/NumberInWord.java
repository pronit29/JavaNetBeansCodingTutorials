/*
 * Step 1 - Create one method printNumberInWord which accepts one parameter of type int and does not return any value
 * Step 2 - According to the number passed as argument, print the number in word from 0 to 9. If the number is less than 0 
            and greater than 9 then print "Other Number" using switch statement
 */
package com.basic.codes.javatutorial.Challenges.SwitchStatement;

/**
 *
 * @author Pronit Kundu
 */
public class NumberInWord {
 
    public static void printNumberInWord(int number) {
        
        switch(number) {
            
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("Other Number");
        }
        
    }
    
    public static void main(String[] args) {
        
        printNumberInWord(2);
    }
    
}
