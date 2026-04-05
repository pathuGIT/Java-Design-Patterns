abstract class Animal{
    abstract void sound();
}
class Lion extends Animal{
    @Override
    void sound(){
        System.out.println("Huwww Huw");
    }
}
class Tiger extends Animal{
    @Override
    void sound(){
        System.out.println("Kruww kruwww");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.sound();
        Animal tiger = new Tiger();
        tiger.sound();
    }
}