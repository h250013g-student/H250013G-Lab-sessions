public class Exercise5Payments {
    interface Payment { void process(); }
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.pay(new CardPayment());
        processor.pay(new MobileMoneyPayment());
    }
}

class CardPayment implements Exercise5Payments.Payment {
    @Override
    public void process() {
        System.out.println("Card payment processed");
    }
}

class MobileMoneyPayment implements Exercise5Payments.Payment {
    @Override
    public void process() {
        System.out.println("Mobile money payment processed");
    }
}

class PaymentProcessor {
    void pay(Exercise5Payments.Payment payment) {
        // Let each payment type perform its own processing.
        payment.process();
    }
}
