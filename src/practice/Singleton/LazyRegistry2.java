package practice.Singleton;

public class LazyRegistry2 {
    private LazyRegistry2(){
        System.out.println("Inside Constructor");
    }

    private static class RegistryHolder {
        static LazyRegistry2 instance=new LazyRegistry2();
    }

    public static LazyRegistry2 getInstance(){
        return RegistryHolder.instance;
    }

}
