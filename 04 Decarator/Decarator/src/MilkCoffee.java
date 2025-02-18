public class MilkCoffee implements Cofee{
    private Cofee cofeeDecorator;

    public MilkCoffee(Cofee cofeeDecorator) {
        this.cofeeDecorator = cofeeDecorator;
    }

    @Override
    public double cost() {
        return cofeeDecorator.cost() + 4.0;
    }
}
