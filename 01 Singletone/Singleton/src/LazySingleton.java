public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton(){
        System.out.println("I am Lazy Initialization");
    }
    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
