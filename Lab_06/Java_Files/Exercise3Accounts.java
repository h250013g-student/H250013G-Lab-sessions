abstract class Account {
    double balance;
    Account(double balance) { this.balance = balance; }
    void deposit(double amount) { balance += amount; }
    abstract double monthlyFee();
}
class SavingsAccount extends Account {
    SavingsAccount(double balance) { super(balance); }
    double monthlyFee() { return 2.0; }
}
class CurrentAccount extends Account {
    CurrentAccount(double balance) { super(balance); }
    double monthlyFee() { return 5.0; }
}
public class Exercise3Accounts {
    public static void main(String[] args) {
        Account a = new SavingsAccount(100);
        a.deposit(20);
        System.out.println("Balance: " + a.balance + ", fee: " + a.monthlyFee());
        Account b = new CurrentAccount(100);
        System.out.println("Fee: " + b.monthlyFee());
    }
}
