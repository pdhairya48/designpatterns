package practice.Strategy;

import java.util.Collection;
import java.util.Iterator;
import com.sun.tools.corba.se.idl.constExpr.Or;


public class SummaryPrinter implements OrderInterface{
    @Override public void runAlgorithm(final Collection<Order> orders) {
        System.out.println("***Summary Report*****");
        Iterator<Order> it=orders.iterator();
        for(int i = 1; it.hasNext();i++){
            Order order = it.next();
            System.out.println(i+". "+ order.getId() + ":::" + order.getItems().size());

        }
    }
}
