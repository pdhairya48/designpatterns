package Singleton;

public class EagerResistry {
    private static final EagerResistry instance=new EagerResistry();
    private EagerResistry(){

    }
    public static EagerResistry getInstance(){
        return instance;
    }
}
