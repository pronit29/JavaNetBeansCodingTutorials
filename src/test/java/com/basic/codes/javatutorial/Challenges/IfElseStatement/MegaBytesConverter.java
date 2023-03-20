/*
 * Step 1 - Create one method printMegaBytesAndKiloBytes that accepts an int data type parameter and method returns nothing i.e. void
 * Step 2 - Calculate MB and the remaining KB from the KiloBytes entry
 * Step 3 - Print the message in the console in the format --> XX KB = YY MB and ZZ KB
 * Step 4 - If kiloBytes < 0, print "Invalid Value"
 * Note - 1 MB = 1024 KB
 */
package com.basic.codes.javatutorial.Challenges.IfElseStatement;

/**
 *
 * @author Pronit Kundu
 */
public class MegaBytesConverter {
    
public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    
    int remainingKB;
    int calculatedMB;
    if(kiloBytes < 0) {
        System.out.println("Invalid Value");
    } else {
        remainingKB = kiloBytes % 1024;
        calculatedMB = kiloBytes / 1024;
        System.out.println(kiloBytes + " KB = " + calculatedMB + " MB and " + remainingKB + " KB");
    }
}
    
    public static void main(String[] args) {
        
        printMegaBytesAndKiloBytes(5000);
    }
}
