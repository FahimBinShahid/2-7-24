package dev.lpa;

import java.util.ArrayList;
import java.util.Scanner;
public class Branch {
    ArrayList<Customer> customerArray = new ArrayList<Customer>();
    Scanner scanner = new Scanner(System.in);
    private String name;
    private double transaction;


    public void addNewCustomer(){
        System.out.println("Add the customer's name");
        name = scanner.nextLine();
        System.out.println("Add the customer's initial transaction");
        transaction = scanner.nextDouble();
        Customer customer = new Customer(name, transaction);
        System.out.println("Customer's name is " + customer.getCustomerName());
        System.out.println("Customer made the transaction pf " + customer.getTransaction());
        customerArray.add(customer);
        scanner.nextLine();
    }

    public void addTransaction(){
        System.out.println("Which cutomer would you like to add transaction to?");
        String name = scanner.nextLine();
        for(int i =0; i<customerArray.size();i++){
            if(customerArray.get(i).getCustomerName().equals(name)){
                System.out.println("Customer found");
                int index = i;
                System.out.println("How much more would you like to add?");
                transaction = scanner.nextDouble();
                double counter = customerArray.get(i).getTransaction() + transaction;
                customerArray.get(i).setTransaction(counter);
                System.out.println("Transaction completed. Your account now has $" + counter);
                break;
            }
            else if(customerArray.size() == 0){
                System.out.println("There are no customers");
            }
            else{
                System.out.println("Customer not found");
            }

        }
    }

    public void printSummary(){
        if(customerArray.size() == 0){
            System.out.println("There are no customers");
        }
        else{
            for(int i =0;i<customerArray.size();i++){
                System.out.println(customerArray.get(i).getTransaction());
                System.out.println(i+1+". " +customerArray.get(i).getCustomerName()
                + " Initial Transaction : S " +customerArray.get(i).getTransaction());
            }
        }
    }

    public String getName(){
        return name;
    }
    public double getTransaction(){
        return transaction;
    }
    public void setTransaction(double transaction){
        this.transaction = transaction;
    }
}
