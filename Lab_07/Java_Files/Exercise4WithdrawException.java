class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class WithdrawalAccount {
    double balance;

    WithdrawalAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds");
        }
        balance -= amount;
    }
}

public class Exercise4WithdrawException {
    public static void main(String[] args) {
        WithdrawalAccount account = new WithdrawalAccount(100);
        try {
            account.withdraw(150);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        // A rejected withdrawal leaves the balance unchanged.
        System.out.println("Balance: " + account.balance);
    }
}
