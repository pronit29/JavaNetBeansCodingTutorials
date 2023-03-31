/*
 * This class is an Encapsulated class holding the parameters and the Getters and Setters for Bank Account details
 */
package com.basic.codes.javatutorial.Challenges.ClassesAndObjects.BankAccountChallenge;

/**
 *
 * @author Pronit Kundu
 */
public class BankAccount {
    
    private int accountNumber;
    private int accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;
    
    public int getAccountNumber(){
        return accountNumber;
    }
    
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    
    public int getAccountBalance(){
        return accountBalance;
    }
    
    public void setAccountBalance(int accountBalance){
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void depositFund(int amountDeposited) {
        accountBalance += amountDeposited;
        if(amountDeposited > 0) {
        setAccountBalance(accountBalance);
        System.out.println("Current balance in your account after the cash deposit: " + getAccountBalance());
        } else {
            System.out.println("You have not deposited any amount in your account. Please check again and deposit");
        }
        
    }
    
    public void withdrawFund(int amountWithdrawn) {
        accountBalance -= amountWithdrawn;
        if(accountBalance < 0) {
            setAccountBalance(accountBalance);
            System.out.println("You cannot withdraw this amount as it will bring your account balance to negative. Please deposit some amount before you try to withdraw.");
        } else {
            System.out.println("Current balance in your account after the cash withdrawl: " + getAccountBalance());
        }
    }
    
}
