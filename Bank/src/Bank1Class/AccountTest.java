package Bank1Class;

public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account("Dave Chivasa", 500);

        System.out.println("Created account for " + acct.accountName + " with balance " + acct.getBalance());

        acct.deposit(-50);    
        acct.deposit(200);    

        acct.withdraw(1500); 
        acct.withdraw(500);   

        System.out.println("Final balance for " + acct.accountName + ": " + acct.getBalance());

        System.out.println("Transactions recorded in Bank.txt");
    }
}
