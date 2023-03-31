/*
 * This class is the main class which calls the BankAccount class and accesses its mehtods by instantiating the object of that class
 */
package com.basic.codes.javatutorial.Challenges.ClassesAndObjects.BankAccountChallenge;

/**
 *
 * @author Pronit Kundu
 */
public class AccountStatusDetails {
    
    public static void main(String[] args) {
        
        BankAccount bankAccount = new BankAccount();
        bankAccount.setCustomerName("Pronit Kundu");
        bankAccount.setEmail("pronit@29@gmail.com");
        bankAccount.setPhoneNumber(903874898);
        bankAccount.setAccountNumber(234234233);
        bankAccount.setAccountBalance(100000);
        System.out.println("Hi, " + bankAccount.getCustomerName() + "!!! Welcome to our Bank Portal.Please find your details below - " + "\n" +
                "Your full name - " + bankAccount.getCustomerName() + "\n" +
                "Your email address - " + bankAccount.getEmail() + "\n" +
                "Your phone number - " + bankAccount.getPhoneNumber() + "\n" +
                "Your account number - " + bankAccount.getAccountNumber() + "\n" +
                "Your current account balance - " + bankAccount.getAccountBalance());
        bankAccount.depositFund(50000);
        bankAccount.withdrawFund(30000);
    }
}
