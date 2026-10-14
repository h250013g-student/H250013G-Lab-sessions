import java.util.*;
class BankAccount {
    private double balance;
    private List<String> history = new ArrayList<>();
    BankAccount(double balance) { this.balance = balance; }
    void deposit(double amount) {
        balance += amount;
        history.add("Deposited " + amount);
    }
    List<String> getHistory() {
        return Collections.unmodifiableList(new ArrayList<>(history));
    }
}
public class Exercise3TransactionHistory {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        System.out.println(account.getHistory());
    }
}
