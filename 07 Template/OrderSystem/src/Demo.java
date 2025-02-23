public class Demo {
    public static void main(String[] args) {
        System.out.println("Processing Credit Card Order:");
        OrderProcessTemplate creditCardOrder = new CreditCard();
        creditCardOrder.processOrder();

        System.out.println("\nProcessing PayPal Order:");
        OrderProcessTemplate paypalOrder = new PayPalOrder();
        paypalOrder.processOrder();
    }
}
