public class ChocoCoffee implements Cofee{
    private Cofee cofeeDecorator;

    public ChocoCoffee(Cofee cofeeDecorator) {
        this.cofeeDecorator = cofeeDecorator;
    }


    @Override
    public double cost() {
        return cofeeDecorator.cost() + 7.0;
    }
}
