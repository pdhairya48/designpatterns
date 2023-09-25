package practice.AbstractFactory;

public class Ec2Instance implements Instance{
    public Ec2Instance(Capacity capacity){
        System.out.println("Created ec2");
    }
    @Override public void start() {

    }

    @Override public void attachStorage(final Storage storage) {

    }

    @Override public void stop() {

    }

}
