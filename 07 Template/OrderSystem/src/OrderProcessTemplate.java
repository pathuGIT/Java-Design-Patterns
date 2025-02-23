public abstract class OrderProcessTemplate {
    public final void processOrder() {
        selectProduct();
        addToCart();
        if (isGift()) {
            wrapGift();
        }
        makePayment();
        deliver();
    }

    protected abstract void selectProduct();
    protected abstract void addToCart();
    protected abstract void makePayment();
    protected abstract void deliver();

    protected boolean isGift() {
        return false; // Default: Not a gift
    }

    protected void wrapGift() {
        System.out.println("Wrapping the product as a gift.");
    }
}
