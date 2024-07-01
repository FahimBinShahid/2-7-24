package dev.lpa;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {


        private static Branch branch = new Branch();
        private static ArrayList<Customer> customerArray = new ArrayList<Customer>();
        private static Bank bank = new Bank();
        private static String name;
        private static double transaction;

    public static void showOptions(){

        System.out.println("\t 1. Add new branch");
        System.out.println("\t 2. add customer");
        System.out.println("\t 3. Add transaction to existing customer");
        System.out.println("\t 4. Print Summary");
        System.out.println("\t 5. Quit");


    }

    public static void main(String[] args) {

        boolean cont = true;

        Scanner scanner = new Scanner((System.in));

        System.out.println("Welcome to your banking system.");
        System.out.println("Please select your option - press 0 to see option");


        while (cont) {
            System.out.println("\nPress 0 to see options.");

            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    showOptions();
                    break;
                case 1:
                    bank.addBranch();
                    break;
                case 2:
                    bank.addCustomerToBranch();
                    break;
                case 3:
                    bank.addCustomerTransaction();
                case 4:
                    bank.printBranch();
                    break;
                case 5:
                    cont = false;

                default:
                    System.out.println("Invalid choice. Press 0 to see options.");
                    break;
            }
        }

    }



}