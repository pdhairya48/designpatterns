package Iterator;

import java.io.PrintWriter;


public class Client {
    public static void main(String[] args) {
        Iterator<ThemeColor> itr = ThemeColor.getIterator();
        Iterator<ThemeColor> itr2 = ThemeColor.getIterator();
        System.out.println(itr2.next());
        while(itr.hasNext()){
            System.out.println(itr.next());
            System.out.println(itr.hasNext());
            System.out.println(itr2.hasNext());
        }
        System.out.println(itr2.next());
    }
}
