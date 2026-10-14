public class Exercise4WithdrawException {
    static class InsufficientFundsException extends Exception { InsufficientFundsException(String message){super(message);} }
    static class BankAccount { double balance; BankAccount(double b){balance=b;} void withdraw(double amount) throws InsufficientFundsException { if(amount>balance) throw new InsufficientFundsException("Insufficient funds"); balance-=amount; } }
    public static void main(String[] args) { BankAccount a=new BankAccount(100); try { a.withdraw(150); } catch(InsufficientFundsException e) { System.out.println(e.getMessage()); } System.out.println("Balance: "+a.balance); }
}
