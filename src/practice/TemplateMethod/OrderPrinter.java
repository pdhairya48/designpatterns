package practice.TemplateMethod;

import java.io.IOException;
import java.io.PrintWriter;
import practice.Strategy.Order;


public abstract class OrderPrinter {

    public void printOrder(Order order,String filename) throws IOException{
        try(PrintWriter printWriter = new PrintWriter(filename)){

            printWriter.println(start());

            printWriter.println(formatOrderNumber(order));

            printWriter.println(formatItems(order));

            printWriter.println(formatTotal(order));

            printWriter.println(end());

        }
    }


    //Subclass will be implementing the below methods.
    protected abstract String start();
    protected abstract String formatOrderNumber(final Order order);

    protected abstract String formatItems(final Order order);

    protected abstract String formatTotal(final Order order);

    protected abstract String end();


}
