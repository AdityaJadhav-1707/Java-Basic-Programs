package controlStatements;

import java.util.Scanner;

public class BankApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double balance = 0;
        int choice;

        while (true)
        {
            System.out.println("Select One Option From Below Bank App:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Your current balance is: " + balance+" Rs.");
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0)
                    {
                        balance = balance + deposit;
                        System.out.println("Amount deposited successfully.");
                    }
                    else
                    {
                        System.out.println("Invalid amount! Please enter a positive value.");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > 0 && withdraw <= balance)
                    {
                        balance = balance - withdraw;
                        System.out.println("Amount withdrawn successfully.");
                    }
                    else if (withdraw <= 0)
                    {
                        System.out.println("Invalid amount! Please enter a positive value.");
                    }
                    else
                    {
                        System.out.println("Insufficient balance!");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using our banking service.");
                    scanner.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
            System.out.println("------------------------");
        }
    }
}
