/*
 * Step 1 - Create 3 variables of type byte, short and int
 * Step 2 - Create a forth variable of type long
 * Step 3 - Long variable should be equal to 50000 + 10 * (byte_variable + short_variable + int_variable)
 * Step 4 - Print the ouptut to the console
*/
package com.basic.codes.javatutorial.Challenges.PrimitiveDataTypeChallenge;

/**
 *
 * @author Pronit Kundu
 */
public class PrimitiveDataChallenge {
    
    public static void main(String[] args) {
        
        byte myByteVariable = 10;
        short myShortVariable = 1000;
        int myIntegerVariable = 10000;
        long myLongVariable;
        
        System.out.println("<-----------Before the operation is performed on these variables--------------->");
        System.out.println("My Byte variable value: " + myByteVariable);
        System.out.println("My Short variable value: " + myShortVariable);
        System.out.println("My Integer variable value: " + myIntegerVariable);
        
        myLongVariable = 50000 + 10L * (myByteVariable + myShortVariable + myIntegerVariable);
        
        System.out.println("<-----------After the operation is performed on these variables--------------->");
        System.out.println("Value o the Long variable after the operation: " + myLongVariable);
        
        
    }
    
}
