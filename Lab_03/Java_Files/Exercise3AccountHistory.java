import java.util.*;

class BankAccount {
    private double balance;
    private final List<String> history = new ArrayList<>();

    BankAccount(double opening) {
        balance = opening;
        history.add("Opened: " + opening);
    }

    void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException();
        }
        balance += amount;
        history.add("Deposit: " + amount);
    }

    List<String> getHistory() {
        // Return a read-only snapshot rather than the mutable history.
        return Collections.unmodifiableList(new ArrayList<>(history));
    }
}

public class Exercise3AccountHistory {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        System.out.println(account.getHistory());
    }
}
