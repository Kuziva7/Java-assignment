package Bank1Class;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public abstract class Banks {
    protected String accountName;
    protected double balance;

    public Banks(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    // Write transactions to Bank.txt
    protected void record(String action, double amount, String note) {
        try (FileWriter fw = new FileWriter("Bank.txt", true)) {
            fw.write(LocalDateTime.now() + " | " + accountName +
                    " | " + action + " | Amount: " + amount +
                    " | Balance: " + balance +
                    " | " + note + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}