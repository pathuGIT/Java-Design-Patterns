public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() {
        System.out.println("I am EagerSingleton");
    }
    public static EagerSingleton getInstance() {
        return instance;
    }
}
