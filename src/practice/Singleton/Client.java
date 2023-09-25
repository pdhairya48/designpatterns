package practice.Singleton;

public class Client {
    public static void main(String[] args) {
//        EagerResistry e1=EagerResistry.getInstance();
//        EagerResistry e2=EagerResistry.getInstance();
//
//        if(e1==e2){
//            System.out.println("Equal Reference");
//        }
//
//        NonSingleton n1=new NonSingleton();
//        NonSingleton n2=new NonSingleton();
//
//        if(n1 == n2){
//            System.out.println("Equal Ref");
//        }
//        else{
//            System.out.println("Non Equal Ref");
//        }
        LazyRegistry2 singleto=LazyRegistry2.getInstance();
        LazyRegistry2 singleto2=LazyRegistry2.getInstance();
        LazyRegistry2 singleto3=LazyRegistry2.getInstance();



    }
}
