/*
 * This class demonstrates the use of Two-Dimensional arrays
 */
package com.basic.codes.javatutorial.Arrays;

import java.util.Arrays;

/**
 *
 * @author Pronit Kundu
 */
public class TwoDimensionalArrayExample {

    public static void main(String[] args) {
        int[][] originalArray = new int[3][3];
        System.out.println("Array length: " + originalArray.length);

        for (int[] element : originalArray) {
            System.out.println(Arrays.toString(element));
        }

        for(int i = 0; i < originalArray.length; i++) {
            var innerArray = originalArray[i];
            for(int j = 0; j < innerArray.length; j++) {
                
                originalArray[i][j] = (i * 10) + (j + 1);
                
            }
                       
        }
        
        System.out.println(Arrays.deepToString(originalArray));
//        for (var outer : originalArray) {
//            for (var inner : outer) {
//                System.out.print(inner + " ");
//            }
//            System.out.println(" ");
//        }
//    }

}
}
