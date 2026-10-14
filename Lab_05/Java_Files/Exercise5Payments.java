interface Payment { void process(); }
class CardPayment implements Payment {
    public void process() { System.out.println("Card payment processed"); }
}
class MobileMoneyPayment implements Payment {
    public void process() { System.out.println("Mobile money payment processed"); }
}
class PaymentProcessor {
    void pay(Payment payment) { payment.process(); }
}
public class Exercise5Payments {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.pay(new CardPayment());
        processor.pay(new MobileMoneyPayment());
    }
}
