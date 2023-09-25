package practice.Prototype;


public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman s1 = new Swordsman();
        s1.move(new Point3D(-10,0,0), 20);
        s1.attack();
        System.out.println(s1.getPosition());
        System.out.println(s1.toString());
        Swordsman s2 = (Swordsman)s1.clone();
        System.out.println("Cloned swordsman"+s2.toString());
        System.out.println(s2.getPosition());

        System.out.println("Original swordsman: "+s1.toString());
        System.out.println(s1.getPosition());

    }

}
