package controlStatements;//package com.example.controlStatements;

import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float balance = 0;
        int choice = 0;
        float depositAmount = 0;
        float withdrawAmount = 0;

        while (choice != 4) {

            System.out.println("Banking Application");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.println("Please enter your choice: ");
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Your Current Balance is " + balance);
                    break;

                case 2:
                    System.out.println("Please Enter Deposit amount: ");
                    depositAmount = sc.nextFloat();
                    if (depositAmount > 0) {
                        balance = balance + depositAmount;
                        System.out.println("Your Deposited amount is " + depositAmount);
                    }
                    else {
                        System.out.println("Deposit amount is negative");
                    }
                    System.out.println("Your Updated Balance is " + balance);
                    break;

                case 3:
                    System.out.println("Enter Withdrawal Amount:");
                    withdrawAmount = sc.nextFloat();
                    if (withdrawAmount < 0) {
                        System.out.println("Withdrawal Amount is Negative");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient Balance");
                    }
                    else {
                        balance = balance - withdrawAmount;
                        System.out.println("Withdrawal Amount is " + withdrawAmount);
                    }
                    System.out.println("Your Updated Balance is " + balance);
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice. Select Option 1 - 4");
                    break;

            }

        }
        sc.close();
    }
}



