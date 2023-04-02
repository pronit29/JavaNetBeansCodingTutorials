package com.basic.codes.javatutorial.Challenges.AutoboxingAndUnboxing;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {



    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(),
                new ArrayList<>(500));
        transactions.add(initialDeposit);
    }

}

public class AutoboxingAndUnboxingChallenge {

    public static void main(String[] args) {

//        Customer bob = new Customer("Bob S", 1000);
//        System.out.println(bob);
          Bank bank = new Bank("HSBC");
          bank.addNewCustomers("Matt", 500);
          System.out.println(bank);
          bank.addTransaction("Matt", -10.75);
          bank.addTransaction("Matt", -75.10);
          bank.printStatement("Matt");
        bank.addTransaction("Bob S", -10.75);
        bank.addTransaction("Bob S", -75.10);
        bank.printStatement("Bob S");


    }
}

class Bank {

    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer(String customerName) {
        for(var customer : customers) {
            if(customer.name().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found%n", customerName);
        return null;
    }

    public void addNewCustomers(String customerName, double initialDeposit) {
        if(getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName,initialDeposit);
            customers.add(customer);
            System.out.println("New customer added: " + customer);
        }
    }

    public void addTransaction(String name, double transactionAmount) {

        Customer customer = getCustomer(name);
        if(customer != null) {
            customer.transactions().add(transactionAmount);
        }

    }

    public void printStatement(String customerName){
        Customer customer = getCustomer(customerName);
        if(customer == null) {
            return;
        }

        System.out.println("-".repeat(30));
        System.out.println("Customer: " + customerName);
        System.out.println("Transactions: ");
        for(double d : customer.transactions()) {
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
        }
    }
}
