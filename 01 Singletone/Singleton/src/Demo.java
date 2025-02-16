public class Demo {
    public static void main(String[] args) {
        //Eager initialization
        //EagerSingleton.getInstance();
        //EagerSingleton.getInstance();

        //Static block initialization
        //StaticBlockSingleton.getInstance();

        //Lazy Initialization
        //LazySingleton.getInstance();

        //Thread Safe Singleton
        //ThreadSafeSingleton.getInstance();
        //ThreaSafeSingletonAdvance.getInstance();

        //Bill Pugh Singleton Implementation. this is good.
        BillPughSingleton.getInstance();
    }
}
