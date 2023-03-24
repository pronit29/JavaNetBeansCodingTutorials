/*
 * Step 1 - Create a method sumFirstAndLastDigit which accepts one parameter of type int and returns the sum
 * Step 2 - Extract the first and the last digit from the number
 * Step 3 - Sum up these two numbers
 * Step 4 - If the number is negative return -1
 */
package com.basic.codes.javatutorial.Challenges.ControlFlow;

/**
 *
 * @author Pronit Kundu
 */
public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        int lastDigit = 0;
        int firstDigit = 0;
        int sum = 0;
        lastDigit = number % 10;
        if (number < 0) {
            return -1;
        } else {
        while (number != 0) {
            firstDigit = number % 10;
            number = number / 10;
        }
        sum = firstDigit + lastDigit;
        return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println("Sum of the first and last digit of the given number: " + sumFirstAndLastDigit(5));
    }

}
