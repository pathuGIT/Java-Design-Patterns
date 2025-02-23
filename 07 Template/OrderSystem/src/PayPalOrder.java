public class PayPalOrder extends OrderProcessTemplate{

    @Override
    protected void selectProduct() {
        System.out.println("Selected product from PayPal store.");
    }

    @Override
    protected void addToCart() {
        System.out.println("Added product to PayPal cart.");
    }

    @Override
    protected void makePayment() {
        System.out.println("Paid using PayPal.");
    }

    @Override
    protected void deliver() {
        System.out.println("Order delivered via Express Shipping.");
    }

    @Override
    protected boolean isGift() {
        return true; // This order is a gift
    }
}
