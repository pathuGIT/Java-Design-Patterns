public class StaticBlockSingleton {
    private static final StaticBlockSingleton instance;

    static {
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception during instance created.");
        }
    }

    private StaticBlockSingleton(){
        System.out.println("I am StaticBlockSingleton");
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}
