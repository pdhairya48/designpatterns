package practice.Strategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import com.sun.org.apache.xpath.internal.operations.Or;


public class Client {
    private static LinkedList<Order> orders = new LinkedList<>();
    public static void main(String []args){
        createOrders();
        PrintService printService = new PrintService(new BriefPrinter());
        printService.printOrders(orders);

    }

    private static void createOrders() {


        Order o = new Order("100");
        Map<String, Double > items1= new HashMap<>();
        items1.put("Soda",2d);
        items1.put("Chips",10d);
        o.setItems(items1);
        orders.add(o);

        o = new Order("200");
        items1= new HashMap<>();
        items1.put("Pepsi",5d);
        items1.put("Biscuit",20d);
        o.setItems(items1);
        orders.add(o);
        
        //orders.forEach(order -> System.out.println(order.getId()+"::"+order.getItems()));

    }
}
