import java.util.*;
public class Exercise3AccountHistory {
    static class BankAccount {
        private double balance; private final List<String> history = new ArrayList<>();
        BankAccount(double opening) { balance = opening; history.add("Opened: " + opening); }
        void deposit(double amount) { if (amount <= 0) throw new IllegalArgumentException(); balance += amount; history.add("Deposit: " + amount); }
        List<String> getHistory() { return Collections.unmodifiableList(new ArrayList<>(history)); }
    }
    public static void main(String[] args) { BankAccount a = new BankAccount(100); a.deposit(50); System.out.println(a.getHistory()); }
}
