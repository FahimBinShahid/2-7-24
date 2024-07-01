package dev.lpa;

import java.util.ArrayList;
import java.util.Scanner;
public class Bank {

    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Branch> branchArray = new ArrayList<Branch>();

    public void addBranch(){
        Branch branch = new Branch();
        branchArray.add(branch);
        System.out.println("New branch added");
        printBranch();

    }

    public void addCustomerToBranch(){
        System.out.println("Choose the branch number");
        Integer branchNumber = scanner.nextInt();
        branchNumber--;
        branchArray.get(branchNumber).addNewCustomer();
        branchNumber++;
        System.out.println("New customer added to branch"+branchNumber);
        scanner.nextLine();
    }

    public void addCustomerTransaction(){
        System.out.println("Add transaction to which customer?");
        String name = scanner.nextLine();
        for(int i =0; i<branchArray.size(); i++){
            if(branchArray.get(i).getName().equals(name)){
                System.out.println("Enter transaction amount");
                Double transaction = scanner.nextDouble();
                transaction += branchArray.get(i).getTransaction();
                branchArray.get(i).setTransaction(transaction);

                System.out.println("The amount of " + transaction + " has been added"
                + "to customer" + name);

                System.out.println("getTransaction is" +
                        branchArray.get(i).getTransaction());
                break;
            }
        }
    }

    public void printBranch(){
        for(int i = 0; i<branchArray.size(); i++){
            System.out.println("Branch" + (i+1) + " " );
            branchArray.get(i).printSummary();
        }
    }





}
