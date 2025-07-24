package application;

import model.entities.Account;
import model.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter account data");
            System.out.println("Number:");
            int number = sc.nextInt();
            System.out.println("Holder:");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.println("Initial balance:");
            double initialBalance = sc.nextDouble();
            System.out.println("Withdraw limit:");
            double withdrawLimit = sc.nextDouble();
            System.out.println();
            System.out.println("Enter amount for withdraw:");
            double amountWithdraw = sc.nextDouble();
            Account account = new Account(number, holder, initialBalance, withdrawLimit);
        try {
            account.withdraw(amountWithdraw);
            System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
        }
        catch (BusinessException e) {
            System.out.println(e.getMessage());
        }
        sc.close();

    }
}
