package practice.Observer;



public class Client {
    public static void main(String[] args) {
        Order order = new Order("100");
        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();
        order.attach(priceObserver);
        order.attach(quantityObserver);

        order.addItem(50);
        System.out.println(order);
        order.addItem(200);
        System.out.println(order);
        order.addItem(2030);
        System.out.println(order);

    }
}
