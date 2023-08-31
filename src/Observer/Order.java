package Observer;

import java.util.ArrayList;
import java.util.List;


public class Order {

    List<OrderObserver> orderObserverList=new ArrayList<>();

    public void attach(OrderObserver observer){
        orderObserverList.add(observer);
    }
    public void detach(OrderObserver observer){
        orderObserverList.remove(observer);
    }

    private String id;
    private double itemCost;
    private int count ;

    private int discount;
    private double shippingCost;

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(final double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public Order(final String id) {
        this.id = id;
    }
    public double getTotal(){
        return itemCost-discount + shippingCost;
    }

    public void addItem(double price){

        itemCost+=price;
        count++;

        orderObserverList.forEach(obs->obs.updated(this));
    }
    public int getCount(){
        return count;
    }
    public double getItemCost(){
        return itemCost;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(final int discount) {
        this.discount = discount;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("Order{");
        sb.append("orderObserverList=").append(orderObserverList);
        sb.append(", id='").append(id).append('\'');
        sb.append(", itemCost=").append(itemCost);
        sb.append(", count=").append(count);
        sb.append(", discount=").append(discount);
        sb.append(", shippingCost=").append(shippingCost);
        sb.append('}');
        return sb.toString();
    }
}
