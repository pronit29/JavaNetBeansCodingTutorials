/*
 * Step 1 - Create a class named Person
 * Step 2 - Create three fields in this class named firtName,lastName of type String and age of type int
 * Step 3 - Create getters and setters for all the fields
 * Step 4 - In the setAge method, check if the value is less than 0 or greater than 100
 * Step 5 - If age is less than 0 or greater than 100, then return 0
 * Step 6 - Create a method named isTeen which does not accept any parameters and returns a boolean value
 * Step 7 - Check if the age is greater than 12 and less than 20
 * Step 8 - If age is less than 12 or greater than 20, then return false, else return true
 * Step 9 - Create another method named getFullName which does not accept any parameters but returns a String
 * Step 10 - Check if the firtName and lastName are empty Strings using the isEmpty() method of the String class
 * Step 11 - If Step 10 is true, then return an empty String
 * Step 12 - If lastName is an empty String, then return the firstName
 * Step 13 - If firstName is an empty String, then return the lastName
 */
package com.basic.codes.javatutorial.Challenges.ClassesAndObjects.PersondetailsChallenge;

/**
 *
 * @author Pronit Kundu
 */
public class Person {
    
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if((age < 0) || (age > 100)) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    
    public boolean isTeen(){
        if((getAge() > 12) && (getAge() < 20)) {
            return true;
        } else {
            return false;
        }
    }
    
    public String getFullName(){
        if((getFirstName().isEmpty()) && (getFirstName().isEmpty())) {
            return "";
        }else if(!((getFirstName().isEmpty()) && (getFirstName().isEmpty()))) {
            return getFirstName() + " " + getLastName();
        }else if(getLastName().isEmpty()) {
            return getFirstName();
        } else {
            return getLastName();
        } 
//else {
//            return getFirstName() + " " + getLastName();
//        }
    }
}
