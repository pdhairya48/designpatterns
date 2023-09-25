package practice.Singleton;

public class LazyRegistry {
    private LazyRegistry(){

    }
    private static volatile LazyRegistry instance;

    public static LazyRegistry getInstance(){
        if(instance==null){
            synchronized (LazyRegistry.class){
                if(instance==null){
                    instance=new LazyRegistry();
                }
                return instance;
            }
        }
        return instance;
    }

}
