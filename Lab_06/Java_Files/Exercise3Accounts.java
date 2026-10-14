abstract class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    abstract double monthlyFee();
}

class SavingsAccount extends Account {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    double monthlyFee() {
        return 2.0;
    }
}

class CurrentAccount extends Account {
    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    double monthlyFee() {
        return 5.0;
    }
}

public class Exercise3Accounts {
    public static void main(String[] args) {
        Account savings = new SavingsAccount(100);
        savings.deposit(20);
        System.out.println("Balance: " + savings.balance
                + ", fee: " + savings.monthlyFee());

        Account current = new CurrentAccount(100);
        // The fee is selected by the concrete account type.
        System.out.println("Current fee: " + current.monthlyFee());
    }
}
