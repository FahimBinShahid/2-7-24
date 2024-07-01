package dev.lpa;
public class Customer {

    private String customerName;
    private double transaction;

    public Customer(String customerName, double transaction){
        this.customerName = customerName;
        this.transaction = transaction;
    }

    public String getCustomerName(){
        return customerName;
    }

    public double getTransaction(){
        return transaction;
    }

    public void setTransaction(double transaction){
        this.transaction = transaction;
    }

}
