package PaymentCase;

public class StripeAdapter implements PaymentProcessor {
    StripePayment stripePayment;

    public StripeAdapter(StripePayment stripePayment) {
        this.stripePayment = stripePayment;
    }

    @Override
    public void processPayment(double amount) {
        stripePayment.charge(amount);
    }
}
