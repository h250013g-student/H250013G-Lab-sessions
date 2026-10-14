class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) { super(message); }
}
class BankAccount {
    private double balance;
    BankAccount(double balance) { this.balance = balance; }
    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) throw new InsufficientFundsException("Insufficient funds");
        balance -= amount;
    }
    double getBalance() { return balance; }
}
public class Exercise4WithdrawException {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        try {
            account.withdraw(30);
            account.withdraw(200);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Balance: " + account.getBalance());
    }
}
