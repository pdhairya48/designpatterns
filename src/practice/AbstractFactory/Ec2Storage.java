package practice.AbstractFactory;

public class Ec2Storage implements Storage{

    public Ec2Storage(int capInMib) {
        System.out.println("allocated cap ec2");
    }

    @Override public void getId() {

    }
}
