/*
 * Step 1 - Create a method numberToWords which accepts one parameter of type int and return nothing i.e. void
 * Step 2 - Check if the number is less than 0
 * Step 3 - If the number is less than 0, print "Invalid Value" in the console
 * Step 4 - Extract all the digits
 * Step 5 - Print the digits in words like 123 --> ONE TWO THREE
 * Step 6 - Create another method reverse to reverse the output in words which accepts one parameter of type int and returns an int value
 * Step 7 - Call this method in the first method
 * Step 8 - Create a third method getDigitCount that accepts one parameter of type int and returns an int value
 * Step 9 - Check if the number is less than 0
 * Step 10 - If it is less than 0, then return -1
 */
package com.basic.codes.javatutorial.Challenges.ControlFlow;

import java.text.DecimalFormat;

/**
 *
 * @author Pronit Kundu
 */
public class NumberToWord {

    public static int getDigitCount(int number) {
        int count = 0;
        int lastDigit;
        if (number < 0) {
            return -1;
        } else {

            while (number != 0) {
                lastDigit = number % 10;
                count++;
                number = number / 10;
            }
          
            return count;
        }
    }

    public static void numberToWords(int number) {
      
        int rev = reverse(number);
 
        int lastDigit;
        if (rev < 0) {
            System.out.println("Invalid Value");
        } else {
           
            while (rev != 0) {
                
                lastDigit = rev % 10;
                rev = rev / 10;
               
                
                switch (lastDigit) {
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                    default:
                        System.out.print("Number is not valid");
                }
            }
        }
    }
    
    public static int reverse(int number) {
        
        int lastDigit;
        int reverse = 0;
        while(number != 0) {
            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println("Total number of digits in the number is: " + getDigitCount(0));
        numberToWords(001);
        
    }
}
