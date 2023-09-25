package practice.AbstractFactory;

public class GcpStorage implements Storage{

    public GcpStorage(int capInMib) {
        System.out.println("allocated cap gcp");
    }

    @Override public void getId() {

    }
}
