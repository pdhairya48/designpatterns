package practice.ObjectPool;

public class Client {
    public static final ObjectPool<BitImage> bitMapPool=new ObjectPool<BitImage>(()-> new BitImage("Logo.bmp"),4);

    public static void main(String[] args) {

        BitImage b1=bitMapPool.get();
        BitImage b2=bitMapPool.get();

    }
}
