package PaymentCase;

public class PaymentDemo {
    public static void main(String[] args) {
        StripePayment stripePayment = new StripePayment();
        PaymentProcessor paymentProcessor = new StripeAdapter(stripePayment);
        paymentProcessor.processPayment(20.5);

        SquarePayment squarePayment = new SquarePayment();
        PaymentProcessor paymentProcessor1 = new SquareAdapter(squarePayment);
        paymentProcessor1.processPayment(500);

        PayPalPayment payPalPayment = new PayPalPayment();
        PaymentProcessor paymentProcessor2 = new PayPalAdapter(payPalPayment);
        paymentProcessor2.processPayment(100);
    }
}
