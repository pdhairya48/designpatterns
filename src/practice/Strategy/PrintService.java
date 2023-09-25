package practice.Strategy;

import java.util.LinkedList;
import com.sun.tools.corba.se.idl.constExpr.Or;


public class PrintService {

    OrderInterface orderPrinter;
    public PrintService(OrderInterface printer) {
        this.orderPrinter = printer;
    }

    public void printOrders(LinkedList<Order> orders){
        orderPrinter.runAlgorithm(orders);
    }
}
