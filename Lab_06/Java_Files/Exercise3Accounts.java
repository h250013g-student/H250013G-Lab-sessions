public class Exercise3Accounts {
    abstract static class Account { double balance; Account(double b){balance=b;} void deposit(double amount){balance+=amount;} abstract double monthlyFee(); }
    static class SavingsAccount extends Account { SavingsAccount(double b){super(b);} double monthlyFee(){return 2.0;} }
    static class CurrentAccount extends Account { CurrentAccount(double b){super(b);} double monthlyFee(){return 5.0;} }
    public static void main(String[] args) { Account a=new SavingsAccount(100); a.deposit(20); System.out.println("Balance: "+a.balance+", fee: "+a.monthlyFee()); Account b=new CurrentAccount(100); System.out.println("Current fee: "+b.monthlyFee()); }
}
