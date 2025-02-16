public class BillPughSingleton {
    private BillPughSingleton(){
        System.out.println("I am BillPughSingleton");
    }
    private static class NewClass{
        private static final BillPughSingleton instance = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){
        return NewClass.instance;
    }
}
