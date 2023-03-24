/*
 * This class represents an example of the traditional Switch statement in Java
 */
package com.basic.codes.javatutorial.SwitchStatement;

/**
 *
 * @author Pronit Kundu
 */
public class BasicSwitchExample {
    
    public static void testSwitchStatement(int value) {
        
        switch(value) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was either 3,4, or 5");
                System.out.println("Actual value was: " + value);
                break;
                default:
                    System.out.println("Value was neither 1,2,3,4 or 5");
        }
        
    }
    
    public static void main(String[] args) {
        
        testSwitchStatement(3);
    }
    
}
