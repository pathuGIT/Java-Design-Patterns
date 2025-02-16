public class ThreaSafeSingletonAdvance {
    private static  ThreaSafeSingletonAdvance instance;

    private ThreaSafeSingletonAdvance(){
        System.out.println("I am ThreaSafeSingletonAdvance");
    }

    public static ThreaSafeSingletonAdvance getInstance(){
        if(instance == null){
            synchronized (ThreaSafeSingletonAdvance.class){
                if (instance == null){
                    instance = new ThreaSafeSingletonAdvance();
                }
            }
        }
        return instance;
    }
}
