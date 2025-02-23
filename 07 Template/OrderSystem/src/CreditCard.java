public class CreditCard extends OrderProcessTemplate{
    @Override
    protected void selectProduct() {
        System.out.println("Selected product from store.");
    }

    @Override
    protected void addToCart() {
        System.out.println("Added product to cart.");
    }

    @Override
    protected void makePayment() {
        System.out.println("Paid using Credit Card.");
    }

    @Override
    protected void deliver() {
        System.out.println("Order delivered via Standard Shipping.");
    }
}
