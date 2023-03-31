/*
 * This class demonstrates the use of Parsing and taking input from console and user
 */
package com.basic.codes.javatutorial.ParsingCommandLines;

import java.util.Scanner;

/**
 *
 * @author Pronit Kundu
 */
public class ParsingExample {
    
    public static String getInputFromConsole(int currentYear){
        
        String name = System.console().readLine("Hi, What's your name?");
        System.out.println("Hi " + name + ", Thanks for taking the course");
        
        String dateOfBirth = System.console().readLine("Which year were you born?");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        
        
        return "So you are " + age + " years old";
    }
    
    public static String getInputFromScanner(int currentYear){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, What's your name?");
        String name = sc.nextLine();
        System.out.println("Hi " + name + ", Thanks for taking the course");
        
        System.out.println("Which year were you born?");
        String dateOfBirth = sc.nextLine();
        int age = currentYear - Integer.parseInt(dateOfBirth);
        
        
        return "So you are " + age + " years old";
    }
    
    public static void main(String[] args) {
        int currentYear = 2023;
        
        try {
        System.out.println(getInputFromConsole(currentYear));
        } catch(NullPointerException e) {
        System.out.println(getInputFromScanner(currentYear));
        }
    }
    
    
}
