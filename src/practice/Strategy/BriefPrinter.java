package practice.Strategy;

import java.util.Collection;
import java.util.Iterator;


public class BriefPrinter implements OrderInterface{
    @Override public void runAlgorithm(final Collection<Order> orders) {
        System.out.println("***Brief Report*****");

        Iterator<Order> it=orders.iterator();
        for(int i = 1; it.hasNext();i++){
            Order order = it.next();
            System.out.println(i+". "+ order.getId());
            for(String key:order.getItems().keySet()){
                System.out.println(key+":::::"+order.getItems().get(key));
            }
        }
    }
}
