public class DecoratorDeomo {
    public static void main(String[] args) {
        Cofee cofee = new SimpleCoffee();

        System.out.println("Simple Coffee is Rs. "+cofee.cost());

        MilkCoffee milkCoffee = new MilkCoffee(cofee);
        System.out.println("Milk Coffee is Rs. "+milkCoffee.cost());

        ChocoCoffee chocCoffee = new ChocoCoffee(cofee);
        System.out.println("Choco Coffee is Rs. "+chocCoffee.cost());
    }
}
