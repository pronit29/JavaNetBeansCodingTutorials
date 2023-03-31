/*
 * Step 1 - Create a method that takes one parameter of type integer array
 * Step 2 - Call this method from the main method
 * Step 3 - Print the original array elements
 * Step 4 - Print the array after reversing it
 * Step 5 - Sample input - [1,2,3,4,5] Sample output - [5,4,3,2,1]
 */
package com.basic.codes.javatutorial.Challenges.Arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Pronit Kundu
 */
public class ReverseArray {

    public static void main(String[] args) {

        int[] arrayElements = getRandomArray(6);
        System.out.println("Original array before reversal: " + Arrays.toString(arrayElements));
        System.out.println("Array after reversal: " + Arrays.toString(reverseArray(arrayElements)));
    }

    public static int[] reverseArray(int[] array) {

        int temp;
        for (int i = 0; i < (array.length) / 2; i++) {

            temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;

        }
        return array;
    }

    private static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

}
