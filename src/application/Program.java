package application;

import model.entities.Account;
import model.entities.exceptions.BalanceError;
import model.entities.exceptions.WithdrawLimit;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws BalanceError, WithdrawLimit {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
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
            account.withdraw(amountWithdraw);
            System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
        }
        catch (BalanceError e ) {
            System.out.println(e.getMessage());
        }

        catch (WithdrawLimit e ) {
            System.out.println(e.getMessage());
        }

    }
}
