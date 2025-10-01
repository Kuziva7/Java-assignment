package Bank1Class;

public class Account extends Banks {

    public Account(String accountName, double balance) {
        super(accountName, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into " + accountName + ". New balance: " + balance);
            record("DEPOSIT", amount, "SUCCESS");
        } else {
            System.out.println("Invalid deposit amount: " + amount + ". Balance unchanged: " + balance);
            record("DEPOSIT", amount, "FAILED");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdrawal amount exceeded account balance");
            record("WITHDRAW", amount, "FAILED");
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from " + accountName + ". New balance: " + balance);
            record("WITHDRAW", amount, "SUCCESS");
        } else {
            System.out.println("Invalid withdrawal amount: " + amount);
            record("WITHDRAW", amount, "FAILED");
        }
    }

    @Override
    public double getBalance() {
        record("BALANCE_CHECK", 0, "OK");
        return balance;
    }
}