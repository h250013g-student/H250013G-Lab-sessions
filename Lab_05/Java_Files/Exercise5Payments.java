public class Exercise5Payments {
    interface Payment { void process(); }
    static class CardPayment implements Payment { public void process(){System.out.println("Card payment processed");} }
    static class MobileMoneyPayment implements Payment { public void process(){System.out.println("Mobile money payment processed");} }
    static class PaymentProcessor {
        void pay(Payment p) { // EXPLAIN: polymorphism avoids type checks.
            p.process();
        }
    }
    public static void main(String[] args) { PaymentProcessor processor=new PaymentProcessor(); processor.pay(new CardPayment()); processor.pay(new MobileMoneyPayment()); }
}
