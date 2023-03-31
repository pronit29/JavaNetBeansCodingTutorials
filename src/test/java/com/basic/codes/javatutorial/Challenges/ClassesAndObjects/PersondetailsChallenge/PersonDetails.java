/*
 * This class is the main class that creates an object of the Person class and accesses the data members and methods of the Person class
 */
package com.basic.codes.javatutorial.Challenges.ClassesAndObjects.PersondetailsChallenge;

/**
 *
 * @author Pronit Kundu
 */
public class PersonDetails {

    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); 
        person.setAge(-5);// firstName is set to John
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); 
        System.out.println("FirstName: " + person.getFirstName());// lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

    }

}
